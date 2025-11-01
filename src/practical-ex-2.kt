// Parent Class: Product
open class Product {
    var productName: String
    var quantity: Int
    var amountPerQuantity: Double

    // Primary constructor
    constructor(productName: String, quantity: Int, amountPerQuantity: Double) {
        this.productName = productName
        this.quantity = quantity
        this.amountPerQuantity = amountPerQuantity
    }

    // Secondary constructor
    constructor() {
        this.productName = ""
        this.quantity = 0
        this.amountPerQuantity = 0.0
    }
}

// Child Class: Laptop
class Laptop : Product {
    var cpu: String
    var ramSize: String
    var hddSize: String

    // Primary constructor
    constructor(productName: String, quantity: Int, amountPerQuantity: Double,
                cpu: String, ramSize: String, hddSize: String) :
            super(productName, quantity, amountPerQuantity) {
        this.cpu = cpu
        this.ramSize = ramSize
        this.hddSize = hddSize
    }

    // Secondary constructor
    constructor() : super() {
        this.cpu = ""
        this.ramSize = ""
        this.hddSize = ""
    }

    fun displayInfo() {
        println("Product Name: $productName")
        println("Quantity: $quantity")
        println("Amount per Quantity: $amountPerQuantity")
        println("CPU: $cpu")
        println("RAM: $ramSize")
        println("HDD: $hddSize")
        println("-------------------------")
    }
}

fun main() {
    val laptops = ArrayList<Laptop>()

    laptops.add(Laptop("Dell Inspiron", 2, 45000.0, "Intel i5", "8GB", "512GB SSD"))
    laptops.add(Laptop("HP Pavilion", 1, 55000.0, "Intel i7", "16GB", "1TB HDD"))
    laptops.add(Laptop("Lenovo ThinkPad", 3, 60000.0, "Intel i5", "8GB", "256GB SSD"))
    laptops.add(Laptop("Acer Aspire", 2, 40000.0, "AMD Ryzen 5", "8GB", "512GB SSD"))
    laptops.add(Laptop("Asus VivoBook", 1, 50000.0, "Intel i7", "16GB", "512GB SSD"))

    for (laptop in laptops) {
        laptop.displayInfo()
    }
}
