package p000;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class V31 {

    /* renamed from: a */
    public static final Pattern f12337a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b */
    public static final Pattern f12338b;

    /* renamed from: c */
    public static final Pattern f12339c;

    /* renamed from: d */
    public static final Pattern f12340d;

    static {
        int i = AbstractC7485Dh1.f2166a;
        Locale locale = Locale.US;
        f12338b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f12339c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f12340d = Pattern.compile("\\\\an(\\d+)");
    }

    /* renamed from: a */
    public static PointF m8288a(String str) throws NumberFormatException {
        String strGroup;
        String strGroup2;
        Matcher matcher = f12338b.matcher(str);
        Matcher matcher2 = f12339c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AbstractC10872rA1.m24174g("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f, Float.parseFloat(strGroup2.trim()));
    }
}
