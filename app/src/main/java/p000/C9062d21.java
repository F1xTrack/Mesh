package p000;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: d21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9062d21 {

    /* renamed from: d */
    public static final Bitmap.Config[] f25769d;

    /* renamed from: e */
    public static final Bitmap.Config[] f25770e;

    /* renamed from: f */
    public static final Bitmap.Config[] f25771f;

    /* renamed from: g */
    public static final Bitmap.Config[] f25772g;

    /* renamed from: h */
    public static final Bitmap.Config[] f25773h;

    /* renamed from: a */
    public final C11840ym0 f25774a = new C11840ym0(1);

    /* renamed from: b */
    public final CC0 f25775b = new CC0(16);

    /* renamed from: c */
    public final HashMap f25776c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f25769d = configArr;
        f25770e = configArr;
        f25771f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f25772g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f25773h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: c */
    public static String m17472c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    public final void m17473a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM17475d = m17475d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM17475d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM17475d.remove(num);
                return;
            } else {
                navigableMapM17475d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m17472c(AbstractC7381Bh1.m804c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* renamed from: b */
    public final Bitmap m17474b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int i3 = 0;
        int iM805d = AbstractC7381Bh1.m805d(config) * i * i2;
        C11840ym0 c11840ym0 = this.f25774a;
        InterfaceC9467gC0 interfaceC9467gC0M26250w1 = (InterfaceC9467gC0) ((ArrayDeque) c11840ym0.f11615b).poll();
        if (interfaceC9467gC0M26250w1 == null) {
            interfaceC9467gC0M26250w1 = c11840ym0.m26250w1();
        }
        C8929c21 c8929c21 = (C8929c21) interfaceC9467gC0M26250w1;
        c8929c21.f17266b = iM805d;
        c8929c21.f17267c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = AbstractC8801b21.f16719a[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : f25773h : f25772g : f25771f : f25769d;
        } else {
            configArr = f25770e;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer num = (Integer) m17475d(config2).ceilingKey(Integer.valueOf(iM805d));
            if (num == null || num.intValue() > iM805d * 8) {
                i3++;
            } else if (num.intValue() != iM805d || (config2 != null ? !config2.equals(config) : config != null)) {
                c11840ym0.m7845n1(c8929c21);
                int iIntValue = num.intValue();
                Object objM26250w1 = (InterfaceC9467gC0) ((ArrayDeque) c11840ym0.f11615b).poll();
                if (objM26250w1 == null) {
                    objM26250w1 = c11840ym0.m26250w1();
                }
                c8929c21 = (C8929c21) objM26250w1;
                c8929c21.f17266b = iIntValue;
                c8929c21.f17267c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f25775b.m1037Q0(c8929c21);
        if (bitmap != null) {
            m17473a(Integer.valueOf(c8929c21.f17266b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* renamed from: d */
    public final NavigableMap m17475d(Bitmap.Config config) {
        HashMap map = this.f25776c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: e */
    public final void m17476e(Bitmap bitmap) {
        int iM804c = AbstractC7381Bh1.m804c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C11840ym0 c11840ym0 = this.f25774a;
        InterfaceC9467gC0 interfaceC9467gC0M26250w1 = (InterfaceC9467gC0) ((ArrayDeque) c11840ym0.f11615b).poll();
        if (interfaceC9467gC0M26250w1 == null) {
            interfaceC9467gC0M26250w1 = c11840ym0.m26250w1();
        }
        C8929c21 c8929c21 = (C8929c21) interfaceC9467gC0M26250w1;
        c8929c21.f17266b = iM804c;
        c8929c21.f17267c = config;
        this.f25775b.m1076h1(c8929c21, bitmap);
        NavigableMap navigableMapM17475d = m17475d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM17475d.get(Integer.valueOf(c8929c21.f17266b));
        navigableMapM17475d.put(Integer.valueOf(c8929c21.f17266b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("SizeConfigStrategy{groupedMap=");
        sbM26238o.append(this.f25775b);
        sbM26238o.append(", sortedSizes=(");
        HashMap map = this.f25776c;
        for (Map.Entry entry : map.entrySet()) {
            sbM26238o.append(entry.getKey());
            sbM26238o.append('[');
            sbM26238o.append(entry.getValue());
            sbM26238o.append("], ");
        }
        if (!map.isEmpty()) {
            sbM26238o.replace(sbM26238o.length() - 2, sbM26238o.length(), "");
        }
        sbM26238o.append(")}");
        return sbM26238o.toString();
    }
}
