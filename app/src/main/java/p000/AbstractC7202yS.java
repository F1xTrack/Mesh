package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.dylanvann.fastimage.FastImageCacheControl;
import com.dylanvann.fastimage.FastImageSource;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;

/* renamed from: yS */
/* loaded from: classes.dex */
public abstract class AbstractC7202yS {

    /* renamed from: a */
    public static final ColorDrawable f46258a = new ColorDrawable(0);

    /* renamed from: b */
    public static final C1380Vw f46259b;

    /* renamed from: c */
    public static final C1380Vw f46260c;

    /* renamed from: d */
    public static final C1380Vw f46261d;

    static {
        C1380Vw c1380Vw = new C1380Vw();
        c1380Vw.put("immutable", FastImageCacheControl.IMMUTABLE);
        c1380Vw.put("web", FastImageCacheControl.WEB);
        c1380Vw.put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        f46259b = c1380Vw;
        C1380Vw c1380Vw2 = new C1380Vw();
        c1380Vw2.put("low", EnumC11389vD0.f44275d);
        c1380Vw2.put("normal", EnumC11389vD0.f44274c);
        c1380Vw2.put("high", EnumC11389vD0.f44273b);
        f46260c = c1380Vw2;
        C1380Vw c1380Vw3 = new C1380Vw();
        c1380Vw3.put("contain", ImageView.ScaleType.FIT_CENTER);
        c1380Vw3.put("cover", ImageView.ScaleType.CENTER_CROP);
        c1380Vw3.put("stretch", ImageView.ScaleType.FIT_XY);
        c1380Vw3.put("center", ImageView.ScaleType.CENTER_INSIDE);
        f46261d = c1380Vw3;
    }

    /* renamed from: a */
    public static FastImageSource m26150a(Context context, ReadableMap readableMap) {
        C11321uh0 c11321uh0;
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString("uri");
        C11321uh0 c11321uh02 = L20.f6471a;
        if (readableMap.hasKey("headers")) {
            if (readableMap.getType("headers") == ReadableType.Map) {
                ReadableMap map = readableMap.getMap("headers");
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
                C11065sh0 c11065sh0 = new C11065sh0();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    String string2 = map.getString(strNextKey);
                    if (string2 != null) {
                        c11065sh0.m24769a(strNextKey, string2);
                    }
                }
                c11065sh0.f42550a = true;
                c11321uh0 = new C11321uh0(c11065sh0.f42551b);
            } else {
                ReadableArray array = readableMap.getArray("headers");
                if (array != null && array.size() != 0) {
                    C11065sh0 c11065sh02 = new C11065sh0();
                    for (int i = 0; i < array.size(); i++) {
                        ReadableMap map2 = array.getMap(i);
                        String string3 = map2.hasKey("header") ? map2.getString("header") : null;
                        String string4 = map2.hasKey("value") ? map2.getString("value") : null;
                        if (string3 != null && string4 != null) {
                            c11065sh02.m24769a(string3, string4);
                        }
                    }
                    c11065sh02.f42550a = true;
                    c11321uh0 = new C11321uh0(c11065sh02.f42551b);
                }
            }
            c11321uh02 = c11321uh0;
        }
        return new FastImageSource(context, string, c11321uh02);
    }

    /* renamed from: b */
    public static PR0 m26151b(Context context, FastImageSource fastImageSource, ReadableMap readableMap) {
        String string;
        String string2 = null;
        if (readableMap != null) {
            try {
                string = readableMap.getString("priority");
            } catch (NoSuchKeyException unused) {
            }
        } else {
            string = null;
        }
        EnumC11389vD0 enumC11389vD0 = (EnumC11389vD0) m26152c("priority", "normal", f46260c, string);
        if (readableMap != null) {
            try {
                string2 = readableMap.getString("cache");
            } catch (NoSuchKeyException unused2) {
            }
        }
        FastImageCacheControl fastImageCacheControl = (FastImageCacheControl) m26152c("cache", "immutable", f46259b, string2);
        C3983eK c3983eK = AbstractC4046fK.f27138c;
        int i = AbstractC7139xS.f45639a[fastImageCacheControl.ordinal()];
        boolean z = false;
        boolean z2 = true;
        if (i == 1) {
            c3983eK = AbstractC4046fK.f27136a;
        } else if (i != 2) {
            z2 = false;
        } else {
            z2 = false;
            z = true;
        }
        PR0 pr0 = (PR0) ((PR0) ((PR0) ((PR0) ((PR0) new PR0().diskCacheStrategy(c3983eK)).onlyRetrieveFromCache(z)).skipMemoryCache(z2)).priority(enumC11389vD0)).placeholder(f46258a);
        return fastImageSource.isResource() ? (PR0) pr0.apply(PR0.signatureOf(AbstractC4034f8.m18192a(context))) : pr0;
    }

    /* renamed from: c */
    public static Object m26152c(String str, String str2, HashMap map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        Object obj = map.get(str2);
        if (obj != null) {
            return obj;
        }
        throw new JSApplicationIllegalArgumentException(AbstractC1374Vq.m8590i("FastImage, invalid ", str, " : ", str2));
    }
}
