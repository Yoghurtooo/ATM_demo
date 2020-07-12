import java.util.*
import kotlin.system.exitProcess
var value = 3000.0
var scanner = Scanner(System.`in`)

fun main(){
    login()
    showMenu()

}
//选择界面
fun showMenu(){
    while (true){
        var scanner = Scanner(System.`in`)
        println("------------------------------------")
        println("\t\t欢迎使用XXX银行系统")
        println("------------------------------------")
        println("* 1. 查看账户余额")
        println("* 2. 存款")
        println("* 3. 取款")
        println("* 4. 退出")
        print("请选择您的操作：")
        var choice = scanner.nextInt()
        when(choice){
            1 -> checkMoney()
            2 -> saveMoney()
            3 -> drawMoney()
            4 -> exitATM()
        }
    }
}

//登入
fun login(){
    println("")
    println("------------------------------------")
    println("\t\t欢迎使用XXX银行系统")
    println("------------------------------------")
    while (true) {
        print("[提示] 请输入您的密码: ")
        val pwd = readLine()
        if (pwd != "1234") println("[提示] 密码错误")
        else break
        print("\n[提示] 是否继续输入(0.退出/1.继续)：")
        var whether = scanner.nextInt()
        if (whether == 0) break
    }
}

//查看金额
fun checkMoney(){
    while (true){
        println("您当前账户余额是: $value￥")
        print("\n[提示] 是否继续输入(0.退出/1.继续)：")
        var whether = scanner.nextInt()
        if (whether == 0) break
    }
}
//取款
fun drawMoney(){
    while (true){
        print("[提示] 请选择您的取款金额：")
        var money = scanner.nextDouble()
        if (value - money <0){
            print("[提示] 您的余额不足")
        }else{
            value -= money
            println("您当前账户余额是: $value￥")
        }
        print("\n[提示] 是否继续输入(0.退出/1.继续)：")
        var whether = scanner.nextInt()
        if (whether == 0) break
    }
}

//存款
fun saveMoney(){
    while (true){
        print("[提示] 请选择您的存款金额：")
        var money = scanner.nextDouble()
        value += money
        println("您当前账户余额是: $value￥")
        print("\n[提示] 是否继续输入(0.退出/1.继续)：")
        var whether = scanner.nextInt()
        if (whether == 0) break
    }
}
//退出
fun exitATM(){
    exitProcess(0)
}
