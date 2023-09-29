package org.iesvdm.tiendaOnline;

import java.util.HashSet;
import java.util.Set;

public class WebUser
{
    //Atributos
    public enum State{NEW, ACTIVE, BLOCKED, BANNED};//Tipos de estado

    private String login_id;
    private String password;
    private State state;

    private ShoppingCart shoppingCart;
    private static Set<String> uniqueLoginIds = new HashSet<>();


    //Constructor
    public WebUser(String login_id, String password, State state)
    {
        this.login_id = login_id;
        this.password = password;
        this.state = state;
        this.shoppingCart = new ShoppingCart();

        //logins en uso o no
        if (!isLoginIdUnique(login_id)) {
            throw new IllegalArgumentException("El login_id ya está en uso");
        }
        uniqueLoginIds.add(login_id);
    }

    //Metodos
    /**
     * Comprueba logins
     * @param login_id
     * @return
     */
    private static boolean isLoginIdUnique(String login_id) {
        return !uniqueLoginIds.contains(login_id);
    }
    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id)
    {

        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "WebUser{" +
                "login_id='" + login_id + '\'' +
                ", state=" + state +
                '}' + "\n";
    }
}
