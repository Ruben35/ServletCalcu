
package servletHTML;

public class numeros {
    private int num1;
    private int num2;
    private int result;

    public int getNum1() {
        return num1;
    }
    /**
     * 
     * @param num1 Pongo numero uno 
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    /**
     * 
     * @param num2 Pongo Numero 2
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }
    
    public void setResult(int result) {
        this.result = result;
    }
    
    public void sumar(){
        this.result=this.num1+this.num2;
    }
    
    public void restar(){
        this.result=this.num1-this.num2;
    }
    
    public void multi(){
        this.result=this.num1*this.num2;
    }
    
    public void divide(){
        this.result=this.num1/this.num2;
    }
    
}
