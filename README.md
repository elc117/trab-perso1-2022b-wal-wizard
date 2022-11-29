# Uso de Encapsulamento, Polimorfismo e Herança no Java  !

### Aplicado para em um Banco Digital

#### Diagrama de classes do projeto que será discutido:

![Screenshot_2022-11-29_17-28-54](https://user-images.githubusercontent.com/82295321/204643696-7659e405-f077-4d2a-810d-7b7205ca037b.png)

#### Mas afinal, O que seria Encapsulamento, Herança e Polimorfismo? Bom vamos lá:

### Encapsulamento:

Encapsulamento vem de encapsular, que em programação orientada a objetos significa separar o programa em partes, o mais
isolado possível. A idéia é tornar o software mais flexível, fácil de modificar e de criar novas implementações. O
Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe. É uma forma eficiente de proteger os
dados manipulados dentro da classe, além de determinar onde esta classe poderá ser manipulada. Usamos o nível de acesso
mais restritivo, private, que faça sentido para um membro particular.

#### EX:

```
    public class Pessoa{ 
         private String nome;
         private String sobrenome;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String s){
        sobrenome = s;
    }
 ```

### Herança:

A herança é um mecanismo da Orientação a Objeto que permite criar novas classes a partir de classes já existentes,
aproveitando-se das características existentes na classe a ser estendida. Este mecanismo é muito interessante, pois
promove um grande reuso e reaproveitamento de código existente. Com a herança é possível criar classes derivadas,
subclasses, a partir de classes bases, superclasses. As subclasses são mais especializadas do que as suas superclasses,
mais genéricas. As subclasses herdam todas as características de suas superclasses, como suas variáveis e métodos. A
linguagem Java permite o uso de herança simples, mas não permite a implementação de herança múltipla.

#### EX:

```
    public class Aluno extends Pessoa{
        public String matricula;
    }
```

### Polomorfismo:

Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que
têm a mesma identificação, assinatura, mas comportamentos distintos, especializados para cada classe derivada, usando
para tanto uma referência a um objeto do tipo da superclasse. O overload não é um tipo de polimorfismo, pois com
overload a assinatura do método obrigatoriamente tem que ter argumentos diferentes, requisito que fere o conceito de
Polimorfismo citado acima.

De forma genérica, polimorfismo significa várias formas. No caso da Orientação a Objetos, polimorfismo denota uma
situação na qual um objeto pode se comportar de maneiras diferentes ao receber uma mensagem, dependendo do seu tipo de
criação.

#### EX:

```

abstract class Mamífero {
  public abstract double obterCotaDiariaDeLeite();
}

class Elefante extends Mamífero {
  public double obterCotaDiariaDeLeite(){
    return 20.0;
  }
}

class Rato extends Mamifero {
  public double obterCotaDiariaDeLeite() {
    return 0.5;
  }
}

class Aplicativo {
  public static void main(String args[]){
    System.out.println("Polimorfismo\n");
    Mamifero mamifero1 = new Elefante();
    System.out.println("Cota diaria de leite do elefante: " + mamifero1.obterCotaDiariaDeLeite());
    Mamifero mamifero2 = new Rato();
    System.out.println("Cota diaria de leite do rato: " + mamifero2.obterCotaDiariaDeLeite());
  }
}
```

### Certo, Apos esta pequena introdução (nem tão pequena assim certo kkkk), vamos voltar para nosso projeto, e em como isso tudo será representado no mesmo.

