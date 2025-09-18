package defpackage;

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
public abstract class AbstractC8175yS {
    public static final ColorDrawable a = new ColorDrawable(0);
    public static final C1723Vw b;
    public static final C1723Vw c;
    public static final C1723Vw d;

    static {
        C1723Vw c1723Vw = new C1723Vw();
        c1723Vw.put("immutable", FastImageCacheControl.IMMUTABLE);
        c1723Vw.put("web", FastImageCacheControl.WEB);
        c1723Vw.put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        b = c1723Vw;
        C1723Vw c1723Vw2 = new C1723Vw();
        c1723Vw2.put("low", EnumC7561vD0.d);
        c1723Vw2.put("normal", EnumC7561vD0.c);
        c1723Vw2.put("high", EnumC7561vD0.b);
        c = c1723Vw2;
        C1723Vw c1723Vw3 = new C1723Vw();
        c1723Vw3.put("contain", ImageView.ScaleType.FIT_CENTER);
        c1723Vw3.put("cover", ImageView.ScaleType.CENTER_CROP);
        c1723Vw3.put("stretch", ImageView.ScaleType.FIT_XY);
        c1723Vw3.put("center", ImageView.ScaleType.CENTER_INSIDE);
        d = c1723Vw3;
    }

    public static FastImageSource a(Context context, ReadableMap readableMap) {
        C7460uh0 c7460uh0;
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString("uri");
        C7460uh0 c7460uh02 = L20.a;
        if (readableMap.hasKey("headers")) {
            if (readableMap.getType("headers") == ReadableType.Map) {
                ReadableMap map = readableMap.getMap("headers");
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
                C7078sh0 c7078sh0 = new C7078sh0();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    String string2 = map.getString(strNextKey);
                    if (string2 != null) {
                        c7078sh0.a(strNextKey, string2);
                    }
                }
                c7078sh0.a = true;
                c7460uh0 = new C7460uh0(c7078sh0.b);
            } else {
                ReadableArray array = readableMap.getArray("headers");
                if (array != null && array.size() != 0) {
                    C7078sh0 c7078sh02 = new C7078sh0();
                    for (int i = 0; i < array.size(); i++) {
                        ReadableMap map2 = array.getMap(i);
                        String string3 = map2.hasKey("header") ? map2.getString("header") : null;
                        String string4 = map2.hasKey("value") ? map2.getString("value") : null;
                        if (string3 != null && string4 != null) {
                            c7078sh02.a(string3, string4);
                        }
                    }
                    c7078sh02.a = true;
                    c7460uh0 = new C7460uh0(c7078sh02.b);
                }
            }
            c7460uh02 = c7460uh0;
        }
        return new FastImageSource(context, string, c7460uh02);
    }

    public static PR0 b(Context context, FastImageSource fastImageSource, ReadableMap readableMap) {
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
        EnumC7561vD0 enumC7561vD0 = (EnumC7561vD0) c("priority", "normal", c, string);
        if (readableMap != null) {
            try {
                string2 = readableMap.getString("cache");
            } catch (NoSuchKeyException unused2) {
            }
        }
        FastImageCacheControl fastImageCacheControl = (FastImageCacheControl) c("cache", "immutable", b, string2);
        C3559eK c3559eK = AbstractC3750fK.c;
        int i = AbstractC7985xS.a[fastImageCacheControl.ordinal()];
        boolean z = false;
        boolean z2 = true;
        if (i == 1) {
            c3559eK = AbstractC3750fK.a;
        } else if (i != 2) {
            z2 = false;
        } else {
            z2 = false;
            z = true;
        }
        PR0 pr0 = (PR0) ((PR0) ((PR0) ((PR0) ((PR0) new PR0().diskCacheStrategy(c3559eK)).onlyRetrieveFromCache(z)).skipMemoryCache(z2)).priority(enumC7561vD0)).placeholder(a);
        return fastImageSource.isResource() ? (PR0) pr0.apply(PR0.signatureOf(AbstractC3714f8.a(context))) : pr0;
    }

    public static Object c(String str, String str2, HashMap map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        Object obj = map.get(str2);
        if (obj != null) {
            return obj;
        }
        throw new JSApplicationIllegalArgumentException(AbstractC1705Vq.i("FastImage, invalid ", str, " : ", str2));
    }
}
