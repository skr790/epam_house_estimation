
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseConstructioncostTest {
    HouseConstructioncost obj=new HouseConstructioncost();
    @Test
    void testCalc() {
        assertEquals(120000, obj.get_cost("standard",100));
        assertEquals(30000, obj.get_cost("above standard",20));
        assertEquals(18000, obj.get_cost("high standard",10));
        assertEquals(5000,obj.get_cost("high standard and automated",2));
    }

}