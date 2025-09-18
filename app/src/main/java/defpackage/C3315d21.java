package defpackage;

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
public final class C3315d21 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final C8236ym0 a = new C8236ym0(1);
    public final CC0 b = new CC0(16);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(AbstractC0121Bh1.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int i3 = 0;
        int iD = AbstractC0121Bh1.d(config) * i * i2;
        C8236ym0 c8236ym0 = this.a;
        InterfaceC3918gC0 interfaceC3918gC0W1 = (InterfaceC3918gC0) ((ArrayDeque) c8236ym0.b).poll();
        if (interfaceC3918gC0W1 == null) {
            interfaceC3918gC0W1 = c8236ym0.w1();
        }
        C2439c21 c2439c21 = (C2439c21) interfaceC3918gC0W1;
        c2439c21.b = iD;
        c2439c21.c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = AbstractC2249b21.a[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        } else {
            configArr = e;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i3++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                c8236ym0.n1(c2439c21);
                int iIntValue = num.intValue();
                Object objW1 = (InterfaceC3918gC0) ((ArrayDeque) c8236ym0.b).poll();
                if (objW1 == null) {
                    objW1 = c8236ym0.w1();
                }
                c2439c21 = (C2439c21) objW1;
                c2439c21.b = iIntValue;
                c2439c21.c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.Q0(c2439c21);
        if (bitmap != null) {
            a(Integer.valueOf(c2439c21.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = AbstractC0121Bh1.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C8236ym0 c8236ym0 = this.a;
        InterfaceC3918gC0 interfaceC3918gC0W1 = (InterfaceC3918gC0) ((ArrayDeque) c8236ym0.b).poll();
        if (interfaceC3918gC0W1 == null) {
            interfaceC3918gC0W1 = c8236ym0.w1();
        }
        C2439c21 c2439c21 = (C2439c21) interfaceC3918gC0W1;
        c2439c21.b = iC;
        c2439c21.c = config;
        this.b.h1(c2439c21, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(c2439c21.b));
        navigableMapD.put(Integer.valueOf(c2439c21.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbO = AbstractC8235ym.o("SizeConfigStrategy{groupedMap=");
        sbO.append(this.b);
        sbO.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbO.append(entry.getKey());
            sbO.append('[');
            sbO.append(entry.getValue());
            sbO.append("], ");
        }
        if (!map.isEmpty()) {
            sbO.replace(sbO.length() - 2, sbO.length(), "");
        }
        sbO.append(")}");
        return sbO.toString();
    }
}
