# SI_2025_lab2_231555
Edin
Bekiroski
231555

Control Flow Graph
![alt text](image-1.png)

Цикломатската комплексност на овој код е 8, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=7, па цикломатската комплексност изнесува 8.

Тест случаи според критериумот Every statement
Ни требаат најмалку 5 за да се поминат низ сите
allItems == null
allitems = 2 item.name==null 
allitems = 2, item.name"e", price=301, discount =10 ,quantity 11, cardNumber 1234567891234567 
allitems = 2, item.name"e", price=301, discount =0 ,quantity 11, cardNumber =null
allitems = 2, item.name"e", price=301, discount =10 ,quantity 11, cardNumber 123456789123456a

Тест случаи според критериумот Every path
    
    item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10
FXX	Item("a", 1, 100, 0.0)
TFX	Item("a", 1, 301, 0.0)
TTF	Item("a", 1, 301, 0.1)
TTT	Item("a", 11, 301, 0.1)
    
    item.getName() == null || item.getName().length() == 0
FX	Item()
TF	Item("")
TT	Item("apple")
    
    
    if (cardNumber != null && cardNumber.length() == 16)
FX	cardNumber=nuлл
TF	cardNumber = 12345
TT	cardNumber = 1234567891234567
    
    
    if (allowed.indexOf(c) == -1
F	123456789123456.
T	1234567891234567