package zhou.demo;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.zzhoujay.richtext.RichText;

/**
 * Created by zhou on 16-6-19.
 */
public class GifActivity extends AppCompatActivity {

    private static final String GIF_TEST = "<h3>Gif Test</h3><img src=\"http://ww4.sinaimg.cn/large/5cfc088ejw1f3jcujb6d6g20ap08mb2c.gif\"/>" +
            "<h3>Test2</h3><img src=\"http://ww4.sinaimg.cn/bmiddle/67bf1bb2gw1eznhegpqawg208c04onpg.gif\"/>";
    private static final String GIF_TEST1 = "'<h1 class=\\\"article-title\\\" style=\\\"margin: 0px; padding: 0px; font-size: 34px; line-height: 48px; color: rgb(34, 34, 34); font-family: &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei&quot;, &quot;WenQuanYi Micro Hei&quot;, &quot;Helvetica Neue&quot;, Arial, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\\\">钂嬪姴澶紝榛戜汉鍔茬垎鎵ｇ锛屾綐鐜煆鐘€鍒╃獊鐮达紝濞变箰鍦堢敺鏄熻皝绡悆姘村钩楂?/h1><p><span class=\\\"src\\\" style=\\\"color: rgb(119, 119, 119); margin-right: 2px;\\\">浣撹偛鐑瘎&nbsp;</span><span class=\\\"time\\\" style=\\\"color: rgb(119, 119, 119); margin-right: 2px;\\\">2017-03-17 21:53</span></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">鈥滈粦浜衡€濋檲寤哄窞锛?6宀佸氨浠ｈ〃涓崕鍙板寳鍙傚姞鈥滀簹娲查潚骞撮敠鏍囪禌鈥濓紝21宀佸氨鎴愪负浜嗚亴涓氱鐞冭繍鍔ㄥ憳锛岃韩浣撶礌璐ㄥ氨涓嶇敤璇翠簡锛岃韩楂?89cm锛屼綋閲?0kg锛岃亴涓氱悆鍛樼殑韬綋鏉′欢锛屽ū涔愬湀浼拌涔熷緢闅炬壘鍑虹浜屼釜浜嗐€?br/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828101774725.gif\\\" title=\\\"1489828101774725.gif\\\" alt=\\\"192000023d95200c4479.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">闅忎究铏愮绛愶紝杩欏姏閲忥紝鐖嗗彂鍔涢兘寰堣冻鍟娿€?/p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828118457864.gif\\\" title=\\\"1489828118457864.gif\\\" alt=\\\"192000023da900931bcd.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">娼樼幃鏌忥紝杩欐槸浠栭珮涓椂鏈熸瘮璧涚殑鐢婚潰锛屾粸绌鸿兘鍔涢潪甯稿嚭鑹诧紝鑰屼笖鎹娼樼幃鏌忚幏寰椾簡NCAA鐨勫瀛﹂噾锛屾槸鏈夋満浼氾紝鏈夎兘鍔涙墦NCAA鑱旇禌鐨勩€?/p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828143655519.gif\\\" title=\\\"1489828143655519.gif\\\" alt=\\\"191e00024266fa8e3f5c.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828150797206.gif\\\" title=\\\"1489828150797206.gif\\\" alt=\\\"191c000243cf27494877.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">韬綋寰堢伒娲伙紝寰堝儚NBA椹埡闃熺殑鎵樺凹-甯曞厠鏈夋病鏈夛紵</p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828161166072.gif\\\" title=\\\"1489828161166072.gif\\\" alt=\\\"191f00029aba6488b6a0.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">闇嶅缓鍗庯紝鏂囪川褰浆鐨勶紝娌℃兂鍒扮鐞冩墦寰椾篃寰堝帀瀹冲悧锛屾€ュ仠璺虫姇涔熸槸鍙互鐨勩€?/p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828171421177.gif\\\" title=\\\"1489828171421177.gif\\\" alt=\\\"191400048a4b4277b9f3.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">杩炵画浜ゅ弶鑳笅锛岃繖鍩烘湰鍔熶篃寰堟墡瀹炲晩銆?/p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828184769994.gif\\\" title=\\\"1489828184769994.gif\\\" alt=\\\"191c0002a9fe59c5afba.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">钂嬪姴澶紝鍙互绉板緱涓婃槸濞变箰鍦堢殑椋炰汉浜嗭紝涔熻绉颁负鎵撶悆鏈€濂界殑鐢锋槦涔嬩竴锛岃繖鍙屾墜鎵ｇ涔熷緢鍔茬垎鍟婏紝寮硅烦闈炲父鍑鸿壊銆?br/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828196403788.gif\\\" title=\\\"1489828196403788.gif\\\" alt=\\\"191c0002abb1d0028c71.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">鍗曡噦鐏岀锛屼竴涓婕旇壓浜嬩笟鑰借浜嗙殑绡悆灏戝勾鐨勩€?br/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828205588085.gif\\\" title=\\\"1489828205588085.gif\\\" alt=\\\"19190002a33d671fc6b2.gif\\\"/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\">浣滀负涓€涓潪鑱屼笟鐨勯€夋墜锛岃繖鎶曠鑳藉姏涔熶笉閿欎簡锛岃兘鎶曪紝鑳界獊锛岃兘鎵ｏ紝杩欐按骞虫墦閲庣悆锛岀О闇搁噹鐞冭禌鍦哄簲璇ユ病鏈変换浣曞帇鍔涘惂銆?br/></p><p style=\\\"margin-top: 18px; margin-bottom: 0px; padding: 0px;\\\"><img src=\\\"http://news-develop.oss-cn-qingdao.aliyuncs.com/upload/ueditor/image/20170318/1489828215512035.gif\\\" title=\\\"1489828215512035.gif\\\" alt=\\\"191e0002ab1644a67801.gif\\\"/></p><p><br/></p>'";
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        textView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        RichText.from(GIF_TEST).autoFix(false).showBorder(true).autoPlay(true).into(textView);
    }

}

