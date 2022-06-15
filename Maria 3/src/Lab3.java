/*Свойства:
- фамилия;
- рота;
- звание;
- дата рождения;
- дата поступления на службу;
- часть;*/
public class Lab3 {
    private String famili;
    private int rote;
    private String zvan;
    private String birthday;
    private String Data;
    private String chast;
    public Lab3(String famili, int rote, String zvan, String birthday, String Data, String chast) {
        this.famili = famili;
        this.rote = rote;
        this.zvan = zvan;
        this.birthday = birthday;
        this.Data = Data;
        this.chast = chast;
    }

    public int getRote() {
        return rote;
    }

    public void setRote(int rote) {
        this.rote = rote;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFamili() {
        return famili;
    }

    public void setFamili(String famili) {
        this.famili = famili;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getZvan() {
        return zvan;
    }

    public void setZvan(String zvan) {
        this.zvan = zvan;
    }

    public String getChast() {
        return chast;
    }

    public void setChast(String chast) {
        this.chast = chast;
    }

    @Override
    public String toString() {
        return "Lab3{" + "famili='" + famili + ' ' + ", rote=" + rote + ", zvan='" + zvan + ' ' + ", birthday='" + birthday + ' ' + ", Data='" + Data + ' ' + ", chast='" + chast + ' ' + '}';
    }
}

































/*{
    private int Id;
    private int codeNumber;
    private int numberPeople;
    private int comfortType;
    private int price;
    public Room(int Id, int codeNumber, int numberPeople, int comfortType, int price){
        this.Id=Id;
        this.codeNumber=codeNumber;
        this.numberPeople=numberPeople;
        this.comfortType=comfortType;
        this.price=price;
    }
    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id=Id;
    }
    public int getCodeNumber(){
        return codeNumber;
    }
    public void setCodeNumber(int codeNumber){
        this.codeNumber=codeNumber;
    }
    public int getNumberPeople(){
        return numberPeople;
    }
    public void setNumberPeople(int numberPeople){
        this.numberPeople=numberPeople;
    }
    public int getComfortType(){
        return comfortType;
    }
    public void setComfortType(int comfortType){
        this.comfortType=comfortType;
    }
    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return "индекатор-"+Id+"\n"+"Koд нoмepa-"+codeNumber+"\n"+"Koличecтвo чeлoвeк-"+numberPeople+"\n"+"Koмфopтнocть-"+comfortType+"/5"+"\n"+"цена-"+price+"руб."+"\n";
    }
}*/


