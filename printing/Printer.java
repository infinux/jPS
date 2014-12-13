package printing;

/**
 * Created by danny on 14-12-13.
 */
public class Printer
{
    public boolean isOn;
    public String modelNumber;

    private String txt;

    public Printer(boolean isOn, String modelNumber) {
        this.txt = "Hello";
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }

    public void print(int copies) {
        //for(int i=0;i<copies;i++)
        while(copies >0)
        {
            if (isOn) {
                System.out.println(new StringBuilder().append(modelNumber).append(" is On").toString());
            }
            else
            {
                System.out.println(new StringBuilder().append(modelNumber).append("is Off").toString());
            }
            copies--;
        }


    }
    public void printColors()
    {
        String[] colors = new String[]  {"red","orange","green","blue"};
        for(String currentColor : colors)
        {
            if("green".equals(currentColor))
                continue;
            System.out.println(currentColor);
        }
    }

    public String getModelNumber()
    {
        return modelNumber;
    }
}