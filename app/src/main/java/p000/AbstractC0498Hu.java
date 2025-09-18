package p000;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* renamed from: Hu */
/* loaded from: classes.dex */
public abstract class AbstractC0498Hu {

    /* renamed from: a */
    public static final Pattern f4570a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    public static final Pattern f4571b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    public static final Pattern f4572c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    public static final HashMap f4573d;

    static {
        HashMap map = new HashMap();
        f4573d = map;
        AbstractC1374Vq.m8595n(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        AbstractC1374Vq.m8595n(-983041, map, "azure", -657956, "beige");
        AbstractC1374Vq.m8595n(-6972, map, "bisque", -16777216, "black");
        AbstractC1374Vq.m8595n(-5171, map, "blanchedalmond", -16776961, "blue");
        AbstractC1374Vq.m8595n(-7722014, map, "blueviolet", -5952982, "brown");
        AbstractC1374Vq.m8595n(-2180985, map, "burlywood", -10510688, "cadetblue");
        AbstractC1374Vq.m8595n(-8388864, map, "chartreuse", -2987746, "chocolate");
        AbstractC1374Vq.m8595n(-32944, map, "coral", -10185235, "cornflowerblue");
        AbstractC1374Vq.m8595n(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        AbstractC1374Vq.m8595n(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        AbstractC1374Vq.m8595n(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        AbstractC1374Vq.m8595n(-29696, map, "darkorange", -6737204, "darkorchid");
        AbstractC1374Vq.m8595n(-7667712, map, "darkred", -1468806, "darksalmon");
        AbstractC1374Vq.m8595n(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        AbstractC1374Vq.m8595n(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        AbstractC1374Vq.m8595n(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        AbstractC1374Vq.m8595n(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        AbstractC1374Vq.m8595n(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        AbstractC1374Vq.m8595n(-38476, map, "hotpink", -3318692, "indianred");
        AbstractC1374Vq.m8595n(-11861886, map, "indigo", -16, "ivory");
        AbstractC1374Vq.m8595n(-989556, map, "khaki", -1644806, "lavender");
        AbstractC1374Vq.m8595n(-3851, map, "lavenderblush", -8586240, "lawngreen");
        AbstractC1374Vq.m8595n(-1331, map, "lemonchiffon", -5383962, "lightblue");
        AbstractC1374Vq.m8595n(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        AbstractC1374Vq.m8595n(-18751, map, "lightpink", -24454, "lightsalmon");
        AbstractC1374Vq.m8595n(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        AbstractC1374Vq.m8595n(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        AbstractC1374Vq.m8595n(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        AbstractC1374Vq.m8595n(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        AbstractC1374Vq.m8595n(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        AbstractC1374Vq.m8595n(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        AbstractC1374Vq.m8595n(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        AbstractC1374Vq.m8595n(-15132304, map, "midnightblue", -655366, "mintcream");
        AbstractC1374Vq.m8595n(-6943, map, "mistyrose", -6987, "moccasin");
        AbstractC1374Vq.m8595n(-8531, map, "navajowhite", -16777088, "navy");
        AbstractC1374Vq.m8595n(-133658, map, "oldlace", -8355840, "olive");
        AbstractC1374Vq.m8595n(-9728477, map, "olivedrab", -23296, "orange");
        AbstractC1374Vq.m8595n(-47872, map, "orangered", -2461482, "orchid");
        AbstractC1374Vq.m8595n(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        AbstractC1374Vq.m8595n(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        AbstractC1374Vq.m8595n(-4139, map, "papayawhip", -9543, "peachpuff");
        AbstractC1374Vq.m8595n(-3308225, map, "peru", -16181, "pink");
        AbstractC1374Vq.m8595n(-2252579, map, "plum", -5185306, "powderblue");
        AbstractC1374Vq.m8595n(-8388480, map, "purple", -10079335, "rebeccapurple");
        AbstractC1374Vq.m8595n(-65536, map, "red", -4419697, "rosybrown");
        AbstractC1374Vq.m8595n(-12490271, map, "royalblue", -7650029, "saddlebrown");
        AbstractC1374Vq.m8595n(-360334, map, "salmon", -744352, "sandybrown");
        AbstractC1374Vq.m8595n(-13726889, map, "seagreen", -2578, "seashell");
        AbstractC1374Vq.m8595n(-6270419, map, "sienna", -4144960, "silver");
        AbstractC1374Vq.m8595n(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        AbstractC1374Vq.m8595n(-12156236, map, "steelblue", -2968436, "tan");
        AbstractC1374Vq.m8595n(-16744320, map, "teal", -2572328, "thistle");
        AbstractC1374Vq.m8595n(-40121, map, "tomato", 0, "transparent");
        AbstractC1374Vq.m8595n(-12525360, map, "turquoise", -1146130, "violet");
        AbstractC1374Vq.m8595n(-663885, map, "wheat", -1, "white");
        AbstractC1374Vq.m8595n(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    /* renamed from: a */
    public static int m3640a(String str, boolean z) throws NumberFormatException {
        int i;
        YN1.m9278c(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (i2 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f4572c : f4571b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f4570a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f4573d.get(PN1.m6357c(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
