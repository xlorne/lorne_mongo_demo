package demo;

import net.sf.json.JSONObject;
import org.junit.Test;
import test.BaseTest;
import test.IMapParam;

/**
 * RestController 测试
 * Created by lorne on 2017/6/12.
 */
public class DemoControllerTest extends BaseTest {


    /**
     * token sign机制
     * RestController封装
     * 自定义异常逻辑处理
     */
    @Test
    public void list(){
        execute("demo/list",true, new IMapParam() {
            @Override
            public void setParams(JSONObject params) {

            }
        });
    }

    @Test
    public void add(){
        execute("demo/add",true, new IMapParam() {
            @Override
            public void setParams(JSONObject params) {
                params.put("id",1);
                params.put("name","admin1");
                params.put("pwd","admin2");

            }
        });
    }


}
