package CommandDesignPattern;

public class RemoteController {

    private final int buttonNum;
    private ICommand[] buttons;
    private boolean[] buttonPressed;

    public RemoteController(){
        this.buttonNum = 4;
        this.buttons = new ICommand[this.buttonNum];
        this.buttonPressed = new boolean[this.buttonNum];
        for (int i=0; i<buttonNum; i++) {
            buttons[i] = null;
            buttonPressed[i] = false;
        }

    }


    public void setCommand(int idx, ICommand cmd){
        if (idx >= 0 && idx < buttonNum){
            if (buttons[idx] != null)
                buttons[idx] = null;
            buttons[idx] = cmd;
            buttonPressed[idx] = false;
        }
    }

    public void pressButton(int idx){
        if (idx >= 0 && idx < buttonNum && buttons[idx] != null){
            if (buttonPressed[idx] == false)
                buttons[idx].execute();
            else
                buttons[idx].undo();

            buttonPressed[idx] = !buttonPressed[idx];
        } else {
            System.out.println("No Command assigned at button "+idx);
        }
    }
}
