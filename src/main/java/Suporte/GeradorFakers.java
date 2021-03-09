package Suporte;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import java.util.Locale;
import java.util.Random;

public class GeradorFakers {

    private Faker fake;
    private int cep;
    private String primeiroNome;
    private String segundoNome;
    private String endereco;
    private String cidade;
    private String telefoneFixo;
    private String celular;
    private String enderecoAlternativo;
    private String emailCriarConta;
    private String senha;

    public GeradorFakers(WebDriver driver){
        fake = new Faker(new Locale("pt-US"));
    }

    public String getCep(){
        Random random = new Random();
        cep = random.nextInt(99999);
        return String.format("%05d", cep);
    }

    public String getPrimeiroNome() {
        primeiroNome = fake.name().firstName();
        return primeiroNome;
    }
    public String getSegundoNome() {
        segundoNome = fake.name().lastName();
        return segundoNome;
    }
    public String getEndereco() {
        endereco = fake.address().streetName();
        return endereco;
    }
    public String getCidade() {
        cidade = fake.address().city();
        return cidade;
    }
    public String getTelefoneFixo() {
        telefoneFixo = fake.phoneNumber().phoneNumber();
        return telefoneFixo;
    }
    public String getTelefoneCelular() {
        celular = fake.phoneNumber().cellPhone();
        return celular;
    }
    public String getEnderecoAlternativo() {
        enderecoAlternativo = fake.internet().emailAddress();
        return enderecoAlternativo;
    }

    public String getEmailCriarConta(){
        emailCriarConta = fake.internet().emailAddress();
        return emailCriarConta;
    }

    public String getSenha(){
        senha = fake.internet().password();
        return senha;
    }

}
