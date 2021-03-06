import com.examples.abstractFactory.ExecutaAbstractFactory;
import com.examples.bridge.ExecutaBridge;
import com.examples.builder.ExecutaBuilder;
import com.examples.chainOfResponsibility.ExecutaChainOfResponsibility;
import com.examples.command.ExecutaCommand;
import com.examples.decorator.ExecutaDecorator;
import com.examples.composite.ExecutaComposite;
import com.examples.adapter.ExecutaAdapter;
import com.examples.dependencyInjection.ExecutaDI;
import com.examples.facade.ExecutaFacade;
import com.examples.flyweight.ExecutaFlyweight;
import com.examples.interpreter.ExecutaInterpreter;
import com.examples.iterator.ExecutaIterator;
import com.examples.mediator.ExecutaMediator;
import com.examples.memento.ExecutarMemento;
import com.examples.observer.ExecutaObserver;
import com.examples.prototype.ExecutaPrototype;
import com.examples.proxy.ExecutaProxy;
import com.examples.singleton.ExecutaSingleton;
import com.examples.state.ExecutaState;
import com.examples.strategy.ExecutaStrategy;
import com.examples.factoryMethod.ExecutaFactoryMethod;
import com.examples.templateMethod.ExecutaTemplateMethod;
import com.examples.visitor.ExecutaVisitor;

/**
 * Classe criada para centralizar todos as execuções de Patterns contidos na solution.
 * Para executar um Pattern, na execução da classe Main, utilize como um primeiro parâmetro
 * Um dos nomes de pattern disponíveis nos exemplos, ou modificar na clausula IF antes do Switch
 * principal o nome do pattern
 *
 * @author Ricardo D. Agulhari
 * Janeiro/2017
 */
public class Main {

    public static void main(String[] args){

        /*Variável usada para definição do pattern de execução. Contém um valor padrão que
        pode ser modificada para um dos patterns listados no Switch abaixo.
         */
        String pattern = "composite";

        //Tratamento dos parâmetros usados na execução. Só será considerado o primeiro parâmetro.
        try {
            if (args.length > 0)
                pattern = args[0];
        } catch (IndexOutOfBoundsException err) {
            err.printStackTrace();
        }

        /*
        * Todos os patterns tem por padrão uma classe como nome "Executa" + o nome da pattern
        * Cada uma dessas classes possui um único método estático: go()
        * Essa classe serve apenas para configurar o exemplo selecionado e foi construída
        * para deixar essa classe principal mais bem organizada.
        * */

        switch (pattern){
            case "abstractFactory":
                ExecutaAbstractFactory.go();
                break;
            case "adapter":
                ExecutaAdapter.go();
                break;
            case "bridge":
                ExecutaBridge.go();
                break;
            case "builder":
                ExecutaBuilder.go();
                break;
            case "chainOfResponsibility":
                ExecutaChainOfResponsibility.go(330);
                break;
            case "command":
                ExecutaCommand.go();
                break;
            case "composite":
                ExecutaComposite.go();
                break;
            case "decorator":
                ExecutaDecorator.go();
                break;
            case "dependencyInjection":
                ExecutaDI.go();
                break;
            case "facade":
                ExecutaFacade.go();
                break;
            case "factorymethod":
                ExecutaFactoryMethod.go();
                break;
            case "flyweight":
                ExecutaFlyweight.go(10000);
                break;
            case "interpreter":
                ExecutaInterpreter.go();
                break;
            case "iterator":
                ExecutaIterator.go();
                break;
            case "mediator":
                ExecutaMediator.go();
                break;
            case "memento":
                ExecutarMemento.go();
                break;
            case "observer":
                ExecutaObserver.go();
                break;
            case "prototype":
                ExecutaPrototype.go();
                break;
            case "proxy":
                ExecutaProxy.go();
                break;
            case "singleton":
                ExecutaSingleton.go();
                break;
            case "state":
                ExecutaState.go();
                break;
            case "strategy":
                ExecutaStrategy.go();
                break;
            case "templateMethod":
                ExecutaTemplateMethod.go();
                break;
            case "visitor":
                ExecutaVisitor.go();
                break;
            default:
                //Tratamento caso o pattern não seja achado.
                System.out.println("Não foi encontrado pattern com o nome " + pattern);
                 break;
        }

    }
}

