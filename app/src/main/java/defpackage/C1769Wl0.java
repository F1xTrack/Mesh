package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.huawei.hms.rn.push.constants.Core;
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
public final class C1769Wl0 {
    public final WeakReference a;
    public boolean b;
    public String c;
    public ImageView.ScaleType d;
    public String e;
    public Boolean f;
    public Boolean g;
    public ReadableArray h;
    public ReadableArray i;
    public XQ0 j;
    public Integer k;
    public String l;
    public String m;
    public String n;
    public Float o;
    public Boolean p;
    public Boolean q;
    public Float r;

    public C1769Wl0(C1145Ol0 c1145Ol0) {
        O90.f(c1145Ol0, "view");
        this.a = new WeakReference(c1145Ol0);
        c1145Ol0.setFontAssetDelegate(new C1691Vl0(c1145Ol0));
    }

    public final void a() {
        int iIntValue;
        List listE;
        Collection collectionX;
        Object objB;
        C1145Ol0 c1145Ol0 = (C1145Ol0) this.a.get();
        if (c1145Ol0 == null) {
            return;
        }
        ReadableArray readableArray = this.i;
        if (readableArray != null && readableArray.size() > 0) {
            C5450k91 c5450k91 = new C5450k91(c1145Ol0);
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                ReadableMap map = readableArray.getMap(i);
                if (map != null) {
                    c5450k91.a.put(map.getString("find"), map.getString("replace"));
                    C1145Ol0 c1145Ol02 = c5450k91.b;
                    if (c1145Ol02 != null) {
                        c1145Ol02.invalidate();
                    }
                }
            }
            c1145Ol0.setTextDelegate(c5450k91);
        }
        String str = this.l;
        if (str != null) {
            c1145Ol0.f(new ByteArrayInputStream(str.getBytes()), String.valueOf(str.hashCode()));
            this.l = null;
        }
        String str2 = this.m;
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                c1145Ol0.f(new FileInputStream(file), String.valueOf(str2.hashCode()));
            } else {
                c1145Ol0.h(str2, String.valueOf(str2.hashCode()));
            }
            this.m = null;
        }
        String str3 = this.n;
        if (str3 != null) {
            File file2 = new File(str3);
            if (file2.exists()) {
                c1145Ol0.g(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                this.n = null;
                return;
            }
            try {
                objB = Uri.parse(str3).getScheme();
            } catch (Throwable th) {
                objB = RQ1.b(th);
            }
            if (objB instanceof OS0) {
                objB = null;
            }
            String str4 = (String) objB;
            if (str4 != null) {
                if (str4.equals("file")) {
                    String path = Uri.parse(str3).getPath();
                    if (path != null) {
                        c1145Ol0.g(new ZipInputStream(new FileInputStream(new File(path))), String.valueOf(str3.hashCode()));
                    }
                } else {
                    c1145Ol0.setAnimationFromUrl(str3);
                }
                this.n = null;
                return;
            }
            int identifier = c1145Ol0.getResources().getIdentifier(str3, Core.RAW, c1145Ol0.getContext().getPackageName());
            if (identifier == 0) {
                O90.f("Animation for " + str3 + " was not found in raw resources", "message");
                AbstractC3393dS.e("ReactNative");
                return;
            }
            c1145Ol0.setAnimation(identifier);
            this.b = false;
            this.n = null;
        }
        if (this.b) {
            c1145Ol0.setAnimation(this.c);
            this.b = false;
        }
        Float f = this.o;
        if (f != null) {
            c1145Ol0.setProgress(f.floatValue());
            this.o = null;
        }
        Boolean bool = this.p;
        if (bool != null) {
            c1145Ol0.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.p = null;
        }
        Boolean bool2 = this.q;
        C5948mm0 c5948mm0 = c1145Ol0.h;
        if (bool2 != null && bool2.booleanValue() && !c5948mm0.j()) {
            c1145Ol0.e();
        }
        Float f2 = this.r;
        if (f2 != null) {
            c1145Ol0.setSpeed(f2.floatValue());
            this.r = null;
        }
        ImageView.ScaleType scaleType = this.d;
        if (scaleType != null) {
            c1145Ol0.setScaleType(scaleType);
            this.d = null;
        }
        XQ0 xq0 = this.j;
        if (xq0 != null) {
            c1145Ol0.setRenderMode(xq0);
            this.j = null;
        }
        Integer num = this.k;
        if (num != null) {
            c1145Ol0.setLayerType(num.intValue(), null);
        }
        String str5 = this.e;
        if (str5 != null) {
            c1145Ol0.setImageAssetsFolder(str5);
            this.e = null;
        }
        Boolean bool3 = this.f;
        if (bool3 != null) {
            c1145Ol0.d(bool3.booleanValue());
            this.f = null;
        }
        Boolean bool4 = this.g;
        if (bool4 != null) {
            c1145Ol0.setSafeMode(bool4.booleanValue());
            this.g = null;
        }
        ReadableArray readableArray2 = this.h;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        int size2 = readableArray2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ReadableMap map2 = readableArray2.getMap(i2);
            if (map2 != null) {
                if (map2.getType("color") == ReadableType.Map) {
                    Integer color = ColorPropConverter.getColor(map2.getMap("color"), c1145Ol0.getContext());
                    O90.c(color);
                    iIntValue = color.intValue();
                } else {
                    iIntValue = map2.getInt("color");
                }
                String strI = AbstractC8235ym.i(map2.getString("keypath"), ".**");
                String strQuote = Pattern.quote(".");
                O90.e(strQuote, "quote(...)");
                Pattern patternCompile = Pattern.compile(strQuote);
                O90.e(patternCompile, "compile(...)");
                O90.f(strI, "input");
                AbstractC7538v51.L(0);
                Matcher matcher = patternCompile.matcher(strI);
                if (matcher.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList.add(strI.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList.add(strI.subSequence(iEnd, strI.length()).toString());
                    listE = arrayList;
                } else {
                    listE = AbstractC8259yu.e(strI.toString());
                }
                if (listE.isEmpty()) {
                    collectionX = MN.a;
                    String[] strArr = (String[]) collectionX.toArray(new String[0]);
                    c5948mm0.a(new C0971Mf0((String[]) Arrays.copyOf(strArr, strArr.length)), InterfaceC6902rm0.F, new ES1(new Q01(iIntValue)));
                } else {
                    ListIterator listIterator = listE.listIterator(listE.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collectionX = AbstractC8069xu.X(listE, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    collectionX = MN.a;
                    String[] strArr2 = (String[]) collectionX.toArray(new String[0]);
                    c5948mm0.a(new C0971Mf0((String[]) Arrays.copyOf(strArr2, strArr2.length)), InterfaceC6902rm0.F, new ES1(new Q01(iIntValue)));
                }
            }
        }
    }
}
