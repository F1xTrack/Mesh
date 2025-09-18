package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;

/* renamed from: uj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11326uj1 {

    /* renamed from: a */
    public C9406fj1 f43812a;

    /* renamed from: b */
    public C10302mj1 f43813b;

    /* renamed from: c */
    public C10430nj1 f43814c;

    /* renamed from: d */
    public C10686pj1 f43815d;

    /* renamed from: e */
    public C10686pj1 f43816e;

    /* renamed from: f */
    public C11070sj1 f43817f;

    /* renamed from: g */
    public C11070sj1 f43818g;

    /* renamed from: h */
    public C9406fj1 f43819h;

    /* renamed from: i */
    public C9406fj1 f43820i;

    /* renamed from: j */
    public C9406fj1 f43821j;

    /* renamed from: k */
    public C9406fj1 f43822k;

    /* renamed from: l */
    public C9406fj1 f43823l;

    /* renamed from: m */
    public C9406fj1 f43824m;

    /* renamed from: n */
    public C9662hj1 f43825n;

    /* renamed from: o */
    public C9662hj1 f43826o;

    /* renamed from: p */
    public C9406fj1 f43827p;

    /* renamed from: q */
    public C9662hj1 f43828q;

    /* renamed from: r */
    public C9406fj1 f43829r;

    /* renamed from: s */
    public C9662hj1 f43830s;

    /* renamed from: t */
    public C9662hj1 f43831t;

    /* renamed from: u */
    public C9662hj1 f43832u;

    /* renamed from: v */
    public C10174lj1 f43833v;

    /* renamed from: w */
    public C10174lj1 f43834w;

    /* renamed from: x */
    public C10174lj1 f43835x;

    /* renamed from: y */
    public C9662hj1 f43836y;

    /* renamed from: z */
    public C9662hj1 f43837z;

    /* renamed from: a */
    public static final WritableArray m25226a(C11326uj1 c11326uj1, ArrayList arrayList) {
        c11326uj1.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC7230yu.m26279j();
                    throw null;
                }
                C7941Mb1 c7941Mb1 = (C7941Mb1) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("index", i);
                writableMapCreateMap.putString("title", c7941Mb1.f7251a);
                String str = c7941Mb1.f7252b;
                if (str != null) {
                    writableMapCreateMap.putString("type", str);
                }
                String str2 = c7941Mb1.f7253c;
                if (str2 != null) {
                    writableMapCreateMap.putString("language", str2);
                }
                int i3 = c7941Mb1.f7255e;
                if (i3 > 0) {
                    writableMapCreateMap.putInt("bitrate", i3);
                }
                writableMapCreateMap.putBoolean("selected", c7941Mb1.f7254d);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i = i2;
            }
        }
        O90.m5967e(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }

    /* renamed from: b */
    public static final WritableArray m25227b(C11326uj1 c11326uj1, ArrayList arrayList) {
        c11326uj1.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC7230yu.m26279j();
                    throw null;
                }
                C7941Mb1 c7941Mb1 = (C7941Mb1) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("index", i);
                writableMapCreateMap.putString("title", c7941Mb1.f7251a);
                writableMapCreateMap.putString("type", c7941Mb1.f7252b);
                writableMapCreateMap.putString("language", c7941Mb1.f7253c);
                writableMapCreateMap.putBoolean("selected", c7941Mb1.f7254d);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i = i2;
            }
        }
        O90.m5967e(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }

    /* renamed from: c */
    public static final WritableArray m25228c(C11326uj1 c11326uj1, ArrayList arrayList) {
        c11326uj1.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC7230yu.m26279j();
                    throw null;
                }
                C8477Wj1 c8477Wj1 = (C8477Wj1) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt(Snapshot.WIDTH, c8477Wj1.f13349a);
                writableMapCreateMap.putInt(Snapshot.HEIGHT, c8477Wj1.f13350b);
                writableMapCreateMap.putInt("bitrate", c8477Wj1.f13351c);
                writableMapCreateMap.putString("codecs", c8477Wj1.f13352d);
                writableMapCreateMap.putString("trackId", c8477Wj1.f13354f);
                writableMapCreateMap.putInt("index", c8477Wj1.f13353e);
                writableMapCreateMap.putBoolean("selected", false);
                writableMapCreateMap.putInt("rotation", c8477Wj1.f13355g);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i = i2;
            }
        }
        O90.m5967e(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }
}
