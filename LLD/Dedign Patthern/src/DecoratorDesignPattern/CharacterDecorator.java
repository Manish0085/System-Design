package DecoratorDesignPattern;


public abstract class CharacterDecorator implements ICharacter{

    protected ICharacter character;

    public CharacterDecorator(ICharacter ch){
        this.character = ch;
    }
}
