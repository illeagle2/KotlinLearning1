package com.example.mykotlinlearning1

import org.junit.Assert.*
import org.junit.Test

/**
 *  Data class to hold the [Item]
 */
data class Item(
    val id: String,
    val name: String,
    val price: Double,
    val discount: Double = 0.0
)

class AmazonShoppingCart(val items: MutableList<Item> = mutableListOf()) {

    /**
     * add a new item to the shopping cart
     *
     * @param item - Product added
     */
    fun add(item: Item) {
        items .add(item)
    }

    /**
     * remove an item from the shopping cart
     *
     * @param item - Product removed
     */
    fun remove(item: Item) {
        items .remove(item)
    }

    /**
     * Calculate the subtotal with discounts
     *
     * @return Returns the total amount before taxes
     */
    fun calculateSubTotal(): Double {

        return items.sumOf { it.price} - calculateDiscount()
    }

    /**
     * Calculate the Federal Tax on the subtotal
     *
     * @param taxPercent - Federal Tax
     *
     * @return Returns the tax amount
     */
    fun calculateFederalTax(taxPercent: Double): Double {
        return taxPercent / 100 * calculateSubTotal()
    }

    /**
     * Calculate the State Tax on the subtotal
     *
     * @param taxPercent - State Tax
     *
     * @return Returns the tax amount
     */
    fun calculateStateTax(taxPercent: Double): Double {
        return taxPercent / 100 * calculateSubTotal()

    }

    /**
     * Calculates the grand total after taxes and discounts applied
     *
     * @param federalTaxPercent - Federal Tax
     * @param stateTaxPercent - State tax
     *
     * @return Returns the final amount
     */
    fun calculateFinalTotal(
        federalTaxPercent: Double = 0.0,
        stateTaxPercent: Double = 0.0
    ): Double {
        return calculateSubTotal() +
                calculateFederalTax(federalTaxPercent) + calculateStateTax(stateTaxPercent)
    }

    /**
     * Calculates the discount for each item
     *
     * @return Returns the total discount amount to be deducted from subtotal
     */
    fun calculateDiscount(): Double {
        return items.sumOf { it.discount }
    }
}





class AmazonShoppingCartTest {

    @Test
    fun testAddItem() {
        val cart = AmazonShoppingCart()
        val item = Item("1", "Item 1", 10.0)
        cart.add(item)
        assertEquals(1, cart.items.size)
    }

    @Test
    fun testRemoveItem() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0)
        val item2 = Item("2", "Item 2", 20.0)
        cart.add(item1)
        cart.add(item2)
        cart.remove(item1)

        assertEquals(1, cart.items.size)
    }

    @Test
    fun testTotalPrice() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0)
        val item2 = Item("2", "Item 2", 20.0)
        cart.add(item1)
        cart.add(item2)

        assertEquals(30.0, cart.calculateSubTotal(), 0.1)
    }

    @Test
    fun testGetFinalTotalWithNoStateTax() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0, 2.0)
        val item2 = Item("2", "Item 2", 10.0)
        cart.add(item1)
        cart.add(item2)
        //"Discounted price with 10% federal tax should be $19.8"
        assertEquals ( 19.8,
        cart.calculateFinalTotal(10.00, 0.00), .01
        )
    }

    @Test
    fun testGetFinalTotalWithNoFederalTax() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0, 2.0)
        val item2 = Item("2", "Item 2", 10.0)
        cart.add(item1)
        cart.add(item2)

        //"Discounted price with 10% federal tax should be $19.8"
        assertEquals(
            19.8,
            cart.calculateFinalTotal(stateTaxPercent = 10.0),
            0.01
        )
    }

    @Test
    fun testGetFinalTotalWithFederalTaxAndNoDiscount() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0)
        val item2 = Item("2", "Item 2", 10.0)
        cart.add(item1)
        cart.add(item2)

        assertEquals(
            22.0,
            cart.calculateFinalTotal(10.0),
            0.01
        )
    }

    @Test
    fun testGetFinalTotalWithStateTaxAndNoDiscount() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0)
        val item2 = Item("2", "Item 2", 10.0)
        cart.add(item1)
        cart.add(item2)

        assertEquals(
            22.0,
            cart.calculateFinalTotal(10.0),
            0.01
        )
    }

    @Test
    fun testGetSubTotalWithNoDiscount() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0)
        val item2 = Item("2", "Item 2", 10.0)
        cart.add(item1)
        cart.add(item2)

        assertEquals(
            20.0,
            cart.calculateSubTotal(),
            0.01
        )
    }

    @Test
    fun testGetSubTotalWithDiscountOneItem() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0, 10.0)
        val item2 = Item("2", "Item 2", 10.0)
        cart.add(item1)
        cart.add(item2)

        assertEquals(
            10.0,
            cart.calculateSubTotal(),
            0.01
        )
    }

    @Test
    fun testGetSubTotalAmountWithDiscountTwoItem() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0, 10.0)
        val item2 = Item("2", "Item 2", 10.0, 10.0)
        cart.add(item1)
        cart.add(item2)

        assertEquals(
            0.0,
            cart.calculateSubTotal(),
            0.01
        )
    }

    @Test
    fun testCalculateTotalDiscount() {
        val cart = AmazonShoppingCart()
        val item1 = Item("1", "Item 1", 10.0, 2.0)
        val item2 = Item("2", "Item 2", 10.0)
        cart.add(item1)
        cart.add(item2)

        assertEquals(
            2.0,
            cart.calculateDiscount(),
            0.01
        )
    }
}

fun main(args: Array<String>) {
    var test = AmazonShoppingCartTest()
    test.testAddItem()
    test.testRemoveItem()
    test.testTotalPrice()
    test.testGetFinalTotalWithNoStateTax()
    test.testGetFinalTotalWithNoFederalTax()
    test.testGetFinalTotalWithFederalTaxAndNoDiscount()
    test.testGetFinalTotalWithStateTaxAndNoDiscount()
    test.testGetSubTotalWithNoDiscount()
    test.testGetSubTotalWithDiscountOneItem()
    test.testGetSubTotalAmountWithDiscountTwoItem()
    test.testCalculateTotalDiscount()
}
