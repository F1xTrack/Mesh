package p000;

import android.net.Uri;
import android.widget.ImageView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.huawei.hms.p015rn.push.constants.Core;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;

/* renamed from: Wl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8480Wl0 {

    /* renamed from: a */
    public final WeakReference f13374a;

    /* renamed from: b */
    public boolean f13375b;

    /* renamed from: c */
    public String f13376c;

    /* renamed from: d */
    public ImageView.ScaleType f13377d;

    /* renamed from: e */
    public String f13378e;

    /* renamed from: f */
    public Boolean f13379f;

    /* renamed from: g */
    public Boolean f13380g;

    /* renamed from: h */
    public ReadableArray f13381h;

    /* renamed from: i */
    public ReadableArray f13382i;

    /* renamed from: j */
    public XQ0 f13383j;

    /* renamed from: k */
    public Integer f13384k;

    /* renamed from: l */
    public String f13385l;

    /* renamed from: m */
    public String f13386m;

    /* renamed from: n */
    public String f13387n;

    /* renamed from: o */
    public Float f13388o;

    /* renamed from: p */
    public Boolean f13389p;

    /* renamed from: q */
    public Boolean f13390q;

    /* renamed from: r */
    public Float f13391r;

    public C8480Wl0(C8064Ol0 c8064Ol0) {
        O90.m5968f(c8064Ol0, "view");
        this.f13374a = new WeakReference(c8064Ol0);
        c8064Ol0.setFontAssetDelegate(new C8428Vl0(c8064Ol0));
    }

    /* renamed from: a */
    public final void m8850a() {
        int iIntValue;
        List listM26274e;
        Collection collectionM25978X;
        Object objM7015b;
        C8064Ol0 c8064Ol0 = (C8064Ol0) this.f13374a.get();
        if (c8064Ol0 == null) {
            return;
        }
        ReadableArray readableArray = this.f13382i;
        if (readableArray != null && readableArray.size() > 0) {
            C9974k91 c9974k91 = new C9974k91(c8064Ol0);
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                ReadableMap map = readableArray.getMap(i);
                if (map != null) {
                    c9974k91.f36326a.put(map.getString("find"), map.getString("replace"));
                    C8064Ol0 c8064Ol02 = c9974k91.f36327b;
                    if (c8064Ol02 != null) {
                        c8064Ol02.invalidate();
                    }
                }
            }
            c8064Ol0.setTextDelegate(c9974k91);
        }
        String str = this.f13385l;
        if (str != null) {
            c8064Ol0.m6133f(new ByteArrayInputStream(str.getBytes()), String.valueOf(str.hashCode()));
            this.f13385l = null;
        }
        String str2 = this.f13386m;
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                c8064Ol0.m6133f(new FileInputStream(file), String.valueOf(str2.hashCode()));
            } else {
                c8064Ol0.m6135h(str2, String.valueOf(str2.hashCode()));
            }
            this.f13386m = null;
        }
        String str3 = this.f13387n;
        if (str3 != null) {
            File file2 = new File(str3);
            if (file2.exists()) {
                c8064Ol0.m6134g(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                this.f13387n = null;
                return;
            }
            try {
                objM7015b = Uri.parse(str3).getScheme();
            } catch (Throwable th) {
                objM7015b = RQ1.m7015b(th);
            }
            if (objM7015b instanceof OS0) {
                objM7015b = null;
            }
            String str4 = (String) objM7015b;
            if (str4 != null) {
                if (str4.equals("file")) {
                    String path = Uri.parse(str3).getPath();
                    if (path != null) {
                        c8064Ol0.m6134g(new ZipInputStream(new FileInputStream(new File(path))), String.valueOf(str3.hashCode()));
                    }
                } else {
                    c8064Ol0.setAnimationFromUrl(str3);
                }
                this.f13387n = null;
                return;
            }
            int identifier = c8064Ol0.getResources().getIdentifier(str3, Core.RAW, c8064Ol0.getContext().getPackageName());
            if (identifier == 0) {
                O90.m5968f("Animation for " + str3 + " was not found in raw resources", "message");
                AbstractC3929dS.m17672e("ReactNative");
                return;
            }
            c8064Ol0.setAnimation(identifier);
            this.f13375b = false;
            this.f13387n = null;
        }
        if (this.f13375b) {
            c8064Ol0.setAnimation(this.f13376c);
            this.f13375b = false;
        }
        Float f = this.f13388o;
        if (f != null) {
            c8064Ol0.setProgress(f.floatValue());
            this.f13388o = null;
        }
        Boolean bool = this.f13389p;
        if (bool != null) {
            c8064Ol0.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.f13389p = null;
        }
        Boolean bool2 = this.f13390q;
        C10307mm0 c10307mm0 = c8064Ol0.f8601h;
        if (bool2 != null && bool2.booleanValue() && !c10307mm0.m22955j()) {
            c8064Ol0.m6132e();
        }
        Float f2 = this.f13391r;
        if (f2 != null) {
            c8064Ol0.setSpeed(f2.floatValue());
            this.f13391r = null;
        }
        ImageView.ScaleType scaleType = this.f13377d;
        if (scaleType != null) {
            c8064Ol0.setScaleType(scaleType);
            this.f13377d = null;
        }
        XQ0 xq0 = this.f13383j;
        if (xq0 != null) {
            c8064Ol0.setRenderMode(xq0);
            this.f13383j = null;
        }
        Integer num = this.f13384k;
        if (num != null) {
            c8064Ol0.setLayerType(num.intValue(), null);
        }
        String str5 = this.f13378e;
        if (str5 != null) {
            c8064Ol0.setImageAssetsFolder(str5);
            this.f13378e = null;
        }
        Boolean bool3 = this.f13379f;
        if (bool3 != null) {
            c8064Ol0.m6131d(bool3.booleanValue());
            this.f13379f = null;
        }
        Boolean bool4 = this.f13380g;
        if (bool4 != null) {
            c8064Ol0.setSafeMode(bool4.booleanValue());
            this.f13380g = null;
        }
        ReadableArray readableArray2 = this.f13381h;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        int size2 = readableArray2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ReadableMap map2 = readableArray2.getMap(i2);
            if (map2 != null) {
                if (map2.getType("color") == ReadableType.Map) {
                    Integer color = ColorPropConverter.getColor(map2.getMap("color"), c8064Ol0.getContext());
                    O90.m5965c(color);
                    iIntValue = color.intValue();
                } else {
                    iIntValue = map2.getInt("color");
                }
                String strM26232i = AbstractC7222ym.m26232i(map2.getString("keypath"), ".**");
                String strQuote = Pattern.quote(".");
                O90.m5967e(strQuote, "quote(...)");
                Pattern patternCompile = Pattern.compile(strQuote);
                O90.m5967e(patternCompile, "compile(...)");
                O90.m5968f(strM26232i, "input");
                AbstractC11374v51.m25337L(0);
                Matcher matcher = patternCompile.matcher(strM26232i);
                if (matcher.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList.add(strM26232i.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList.add(strM26232i.subSequence(iEnd, strM26232i.length()).toString());
                    listM26274e = arrayList;
                } else {
                    listM26274e = AbstractC7230yu.m26274e(strM26232i.toString());
                }
                if (listM26274e.isEmpty()) {
                    collectionM25978X = C0779MN.f7117a;
                    String[] strArr = (String[]) collectionM25978X.toArray(new String[0]);
                    c10307mm0.m22947a(new C7948Mf0((String[]) Arrays.copyOf(strArr, strArr.length)), InterfaceC10947rm0.f41863F, new ES1(new Q01(iIntValue)));
                } else {
                    ListIterator listIterator = listM26274e.listIterator(listM26274e.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collectionM25978X = AbstractC7167xu.m25978X(listM26274e, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    collectionM25978X = C0779MN.f7117a;
                    String[] strArr2 = (String[]) collectionM25978X.toArray(new String[0]);
                    c10307mm0.m22947a(new C7948Mf0((String[]) Arrays.copyOf(strArr2, strArr2.length)), InterfaceC10947rm0.f41863F, new ES1(new Q01(iIntValue)));
                }
            }
        }
    }
}
