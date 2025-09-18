package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;

/* renamed from: uj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7467uj1 {
    public C3827fj1 a;
    public C5940mj1 b;
    public C6131nj1 c;
    public C6513pj1 d;
    public C6513pj1 e;
    public C7085sj1 f;
    public C7085sj1 g;
    public C3827fj1 h;
    public C3827fj1 i;
    public C3827fj1 j;
    public C3827fj1 k;
    public C3827fj1 l;
    public C3827fj1 m;
    public C4209hj1 n;
    public C4209hj1 o;
    public C3827fj1 p;
    public C4209hj1 q;
    public C3827fj1 r;
    public C4209hj1 s;
    public C4209hj1 t;
    public C4209hj1 u;
    public C5749lj1 v;
    public C5749lj1 w;
    public C5749lj1 x;
    public C4209hj1 y;
    public C4209hj1 z;

    public static final WritableArray a(C7467uj1 c7467uj1, ArrayList arrayList) {
        c7467uj1.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC8259yu.j();
                    throw null;
                }
                C0960Mb1 c0960Mb1 = (C0960Mb1) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("index", i);
                writableMapCreateMap.putString("title", c0960Mb1.a);
                String str = c0960Mb1.b;
                if (str != null) {
                    writableMapCreateMap.putString("type", str);
                }
                String str2 = c0960Mb1.c;
                if (str2 != null) {
                    writableMapCreateMap.putString("language", str2);
                }
                int i3 = c0960Mb1.e;
                if (i3 > 0) {
                    writableMapCreateMap.putInt("bitrate", i3);
                }
                writableMapCreateMap.putBoolean("selected", c0960Mb1.d);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i = i2;
            }
        }
        O90.e(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }

    public static final WritableArray b(C7467uj1 c7467uj1, ArrayList arrayList) {
        c7467uj1.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC8259yu.j();
                    throw null;
                }
                C0960Mb1 c0960Mb1 = (C0960Mb1) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("index", i);
                writableMapCreateMap.putString("title", c0960Mb1.a);
                writableMapCreateMap.putString("type", c0960Mb1.b);
                writableMapCreateMap.putString("language", c0960Mb1.c);
                writableMapCreateMap.putBoolean("selected", c0960Mb1.d);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i = i2;
            }
        }
        O90.e(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }

    public static final WritableArray c(C7467uj1 c7467uj1, ArrayList arrayList) {
        c7467uj1.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC8259yu.j();
                    throw null;
                }
                C1764Wj1 c1764Wj1 = (C1764Wj1) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt(Snapshot.WIDTH, c1764Wj1.a);
                writableMapCreateMap.putInt(Snapshot.HEIGHT, c1764Wj1.b);
                writableMapCreateMap.putInt("bitrate", c1764Wj1.c);
                writableMapCreateMap.putString("codecs", c1764Wj1.d);
                writableMapCreateMap.putString("trackId", c1764Wj1.f);
                writableMapCreateMap.putInt("index", c1764Wj1.e);
                writableMapCreateMap.putBoolean("selected", false);
                writableMapCreateMap.putInt("rotation", c1764Wj1.g);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i = i2;
            }
        }
        O90.e(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }
}
