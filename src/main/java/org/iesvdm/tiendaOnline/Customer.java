package org.iesvdm.tiendaOnline;

public class Customer
{
    //Atributo
    WebUser usuarioWeb;
    private String adress;
    private String phone;
    private String mail;

    //Constructor
    public Customer(WebUser usuarioWeb, String adress, String phone, String mail)
    {
        this.usuarioWeb = usuarioWeb;
        this.adress = adress;
        this.phone = phone;
        this.mail = mail;
    }

    //Metodos
    public WebUser getUsuarioWeb() {
        return usuarioWeb;
    }

    public void setUsuarioWeb(WebUser usuarioWeb) {
        this.usuarioWeb = usuarioWeb;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "usuarioWeb=" + usuarioWeb + //tener en cuenta si poner tostring
                '}';
    }
}
