package src;

import src.models.Child;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Child ch=new Child("a","b","mahi");
        Parent p=ch;
        Child child= (Child) p;
        //System.out.println(child.getC());
        System.out.println(Integer.toHexString(System.identityHashCode(ch)));
        System.out.println(Integer.toHexString(System.identityHashCode(p)));
        System.out.println(Integer.toHexString(System.identityHashCode(child)));
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
//        FDPEvent event = objectMapper.readValue("{\"event\":\"user_badge\",\"ugcBadges\":\"CATEGORY_BADGE\",\"category\":\"Fashion\",\"accountIds\":[\"ACCAF8E17213B584FD395484E370B06CF80\"]}",FDPEvent.class);
    }
}
