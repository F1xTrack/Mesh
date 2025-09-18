package p000;

import android.graphics.Color;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.facebook.yoga.YogaValue;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class KJ0 extends C10169lh0 {

    /* renamed from: C */
    public int f5991C;

    /* renamed from: E */
    public int f5993E;

    /* renamed from: Z */
    public HashMap f6014Z;

    /* renamed from: z */
    public final InterfaceC9233eN0 f6015z;

    /* renamed from: B */
    public boolean f5990B = false;

    /* renamed from: D */
    public boolean f5992D = false;

    /* renamed from: F */
    public EnumC11528wJ0 f5994F = null;

    /* renamed from: G */
    public EnumC11655xJ0 f5995G = null;

    /* renamed from: H */
    public int f5996H = -1;

    /* renamed from: I */
    public int f5997I = 0;

    /* renamed from: J */
    public int f5998J = 1;

    /* renamed from: K */
    public int f5999K = 0;

    /* renamed from: L */
    public float f6000L = 0.0f;

    /* renamed from: M */
    public float f6001M = 0.0f;

    /* renamed from: N */
    public float f6002N = 0.0f;

    /* renamed from: O */
    public int f6003O = 1426063360;

    /* renamed from: P */
    public boolean f6004P = false;

    /* renamed from: Q */
    public boolean f6005Q = false;

    /* renamed from: R */
    public boolean f6006R = true;

    /* renamed from: S */
    public boolean f6007S = false;

    /* renamed from: T */
    public float f6008T = 0.0f;

    /* renamed from: U */
    public int f6009U = -1;

    /* renamed from: V */
    public int f6010V = -1;

    /* renamed from: W */
    public String f6011W = null;

    /* renamed from: X */
    public String f6012X = null;

    /* renamed from: Y */
    public boolean f6013Y = false;

    /* renamed from: A */
    public final C9846j91 f5989A = new C9846j91();

    public KJ0(InterfaceC9233eN0 interfaceC9233eN0) {
        this.f6015z = interfaceC9233eN0;
    }

    /* renamed from: J */
    public static void m4594J(KJ0 kj0, SpannableStringBuilder spannableStringBuilder, ArrayList arrayList, C9846j91 c9846j91, boolean z, HashMap map, int i) {
        C9846j91 c9846j912;
        EM0 em0;
        C9846j91 c9846j913;
        int i2;
        float fM11093e;
        float f;
        YogaNodeJNIBase yogaNodeJNIBase;
        KJ0 kj02 = kj0;
        if (c9846j91 != null) {
            C9846j91 c9846j914 = kj02.f5989A;
            c9846j912 = new C9846j91();
            c9846j912.f34946a = c9846j91.f34946a;
            c9846j912.f34947b = !Float.isNaN(c9846j914.f34947b) ? c9846j914.f34947b : c9846j91.f34947b;
            c9846j912.f34948c = !Float.isNaN(c9846j914.f34948c) ? c9846j914.f34948c : c9846j91.f34948c;
            c9846j912.f34949d = !Float.isNaN(c9846j914.f34949d) ? c9846j914.f34949d : c9846j91.f34949d;
            c9846j912.f34950e = !Float.isNaN(c9846j914.f34950e) ? c9846j914.f34950e : c9846j91.f34950e;
            c9846j912.f34951f = !Float.isNaN(c9846j914.f34951f) ? c9846j914.f34951f : c9846j91.f34951f;
            int i3 = c9846j914.f34952g;
            if (i3 == 5) {
                i3 = c9846j91.f34952g;
            }
            c9846j912.f34952g = i3;
        } else {
            c9846j912 = kj02.f5989A;
        }
        C9846j91 c9846j915 = c9846j912;
        int iM2182k = kj0.m2182k();
        int i4 = 0;
        while (i4 < iM2182k) {
            EM0 em0M2181j = kj02.m2181j(i4);
            if (em0M2181j instanceof C10127lM0) {
                spannableStringBuilder.append((CharSequence) F91.m2533p(c9846j915.f34952g, ((C10127lM0) em0M2181j).f37026y));
                em0 = em0M2181j;
            } else if (em0M2181j instanceof KJ0) {
                em0 = em0M2181j;
                m4594J((KJ0) em0M2181j, spannableStringBuilder, arrayList, c9846j915, z, map, spannableStringBuilder.length());
            } else {
                em0 = em0M2181j;
                if (em0 instanceof C4124gZ) {
                    spannableStringBuilder.append("0");
                    int length = spannableStringBuilder.length() - 1;
                    int length2 = spannableStringBuilder.length();
                    C4124gZ c4124gZ = (C4124gZ) em0;
                    S91 s91 = c4124gZ.f2652d;
                    UN1.m7999c(s91);
                    i2 = iM2182k;
                    c9846j913 = c9846j915;
                    arrayList.add(new C10793qZ0(length, length2, new C4187hZ(s91.getResources(), (int) Math.ceil(c4124gZ.f27839F), (int) Math.ceil(c4124gZ.f27837D), c4124gZ.f27840G, c4124gZ.f27841z, c4124gZ.f27834A, c4124gZ.f27835B, c4124gZ.f27836C, c4124gZ.f27838E)));
                } else {
                    c9846j913 = c9846j915;
                    i2 = iM2182k;
                    if (!z) {
                        throw new C8810b60("Unexpected view type nested under a <Text> or <TextInput> node: " + em0.getClass());
                    }
                    int i5 = em0.f2649a;
                    YogaNodeJNIBase yogaNodeJNIBase2 = em0.f2669u;
                    YogaValue yogaValueM11091o = YogaNodeJNIBase.m11091o(YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase2.f17997e));
                    YogaValue yogaValueM11091o2 = YogaNodeJNIBase.m11091o(YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase2.f17997e));
                    if (yogaValueM11091o.f18002b == 2 && yogaValueM11091o2.f18002b == 2) {
                        f = yogaValueM11091o.f18001a;
                        fM11093e = yogaValueM11091o2.f18001a;
                    } else {
                        em0.m2179h(Float.NaN, Float.NaN);
                        float fM11095h = yogaNodeJNIBase2.m11095h();
                        fM11093e = yogaNodeJNIBase2.m11093e();
                        f = fM11095h;
                    }
                    spannableStringBuilder.append("0");
                    arrayList.add(new C10793qZ0(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new C10870r91(i5, (int) f, (int) fM11093e)));
                    map.put(Integer.valueOf(i5), em0);
                }
                em0.f2654f = false;
                if (!em0.m2187p() && (yogaNodeJNIBase = em0.f2669u) != null) {
                    yogaNodeJNIBase.m11099l();
                }
                i4++;
                kj02 = kj0;
                iM2182k = i2;
                c9846j915 = c9846j913;
            }
            c9846j913 = c9846j915;
            i2 = iM2182k;
            em0.f2654f = false;
            if (!em0.m2187p()) {
            }
            i4++;
            kj02 = kj0;
            iM2182k = i2;
            c9846j915 = c9846j913;
        }
        C9846j91 c9846j916 = c9846j915;
        int length3 = spannableStringBuilder.length();
        if (length3 >= i) {
            if (kj0.f5990B) {
                arrayList.add(new C10793qZ0(i, length3, new C11530wK0(kj0.f5991C)));
            }
            if (kj0.f5992D) {
                arrayList.add(new C10793qZ0(i, length3, new JJ0(kj0.f5993E)));
            }
            EnumC11655xJ0 enumC11655xJ0 = kj0.f5995G;
            if (enumC11655xJ0 == null ? kj0.f5994F == EnumC11528wJ0.f44783d : enumC11655xJ0 == EnumC11655xJ0.f45544a) {
                arrayList.add(new C10793qZ0(i, length3, new NJ0(kj0.f2649a)));
            }
            float fM21977b = c9846j916.m21977b();
            if (!Float.isNaN(fM21977b) && (c9846j91 == null || c9846j91.m21977b() != fM21977b)) {
                arrayList.add(new C10793qZ0(i, length3, new C0579JB(fM21977b)));
            }
            int iM21976a = c9846j916.m21976a();
            if (c9846j91 == null || c9846j91.m21976a() != iM21976a) {
                arrayList.add(new C10793qZ0(i, length3, new C11017sJ0(iM21976a)));
            }
            if (kj0.f6009U != -1 || kj0.f6010V != -1 || kj0.f6011W != null) {
                int i6 = kj0.f6009U;
                int i7 = kj0.f6010V;
                String str = kj0.f6012X;
                String str2 = kj0.f6011W;
                S91 s912 = kj0.f2652d;
                UN1.m7999c(s912);
                arrayList.add(new C10793qZ0(i, length3, new C1019QB(i6, i7, str, str2, s912.getAssets())));
            }
            if (kj0.f6004P) {
                arrayList.add(new C10793qZ0(i, length3, new C9361fN0()));
            }
            if (kj0.f6005Q) {
                arrayList.add(new C10793qZ0(i, length3, new MM0()));
            }
            if ((kj0.f6000L != 0.0f || kj0.f6001M != 0.0f || kj0.f6002N != 0.0f) && Color.alpha(kj0.f6003O) != 0) {
                arrayList.add(new C10793qZ0(i, length3, new KZ0(kj0.f6000L, kj0.f6001M, kj0.f6002N, kj0.f6003O)));
            }
            float fM21978c = c9846j916.m21978c();
            if (!Float.isNaN(fM21978c) && (c9846j91 == null || c9846j91.m21978c() != fM21978c)) {
                arrayList.add(new C10793qZ0(i, length3, new C0642KB(fM21978c)));
            }
            arrayList.add(new C10793qZ0(i, length3, new TM0(kj0.f2649a)));
        }
    }

    /* renamed from: K */
    public final SpannableStringBuilder m4595K(KJ0 kj0, String str, boolean z, C10910rT1 c10910rT1) {
        int i;
        UN1.m7998b((z && c10910rT1 == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) F91.m2533p(kj0.f5989A.f34952g, str));
        }
        m4594J(kj0, spannableStringBuilder, arrayList, null, z, map, 0);
        kj0.f6013Y = false;
        kj0.f6014Z = map;
        float f = Float.NaN;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C10793qZ0 c10793qZ0 = (C10793qZ0) arrayList.get((arrayList.size() - i2) - 1);
            LM0 lm0 = c10793qZ0.f41024c;
            boolean z2 = lm0 instanceof C4187hZ;
            if (z2 || (lm0 instanceof C10870r91)) {
                if (z2) {
                    i = ((C4187hZ) lm0).f28452e;
                    kj0.f6013Y = true;
                } else {
                    C10870r91 c10870r91 = (C10870r91) lm0;
                    DM0 dm0 = (DM0) map.get(Integer.valueOf(c10870r91.f41366a));
                    c10910rT1.getClass();
                    EM0 em0 = (EM0) dm0;
                    if (em0.f2658j) {
                        c10910rT1.m24374I(dm0, null);
                    }
                    em0.f2657i = kj0;
                    i = c10870r91.f41368c;
                }
                if (Float.isNaN(f) || i > f) {
                    f = i;
                }
            }
            c10793qZ0.m24024a(spannableStringBuilder, i2);
        }
        kj0.f5989A.f34951f = f;
        InterfaceC9233eN0 interfaceC9233eN0 = this.f6015z;
        if (interfaceC9233eN0 != null) {
            ((C0267EE) interfaceC9233eN0).m2072d(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    @InterfaceC9871jM0(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (mo1653c()) {
            this.f5994F = EnumC11528wJ0.m25593a(str);
            mo2191t();
        }
    }

    @InterfaceC9871jM0(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.f6007S) {
            this.f6007S = z;
            mo2191t();
        }
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        C9846j91 c9846j91 = this.f5989A;
        if (z != c9846j91.f34946a) {
            c9846j91.f34946a = z;
            mo2191t();
        }
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (mo1653c()) {
            boolean z = num != null;
            this.f5992D = z;
            if (z) {
                this.f5993E = num.intValue();
            }
            mo2191t();
        }
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
    public void setColor(Integer num) {
        boolean z = num != null;
        this.f5990B = z;
        if (z) {
            this.f5991C = num.intValue();
        }
        mo2191t();
    }

    @InterfaceC9871jM0(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f6011W = str;
        mo2191t();
    }

    @InterfaceC9871jM0(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.f5989A.f34947b = f;
        mo2191t();
    }

    @InterfaceC9871jM0(name = "fontStyle")
    public void setFontStyle(String str) {
        int iM8006c = UO1.m8006c(str);
        if (iM8006c != this.f6009U) {
            this.f6009U = iM8006c;
            mo2191t();
        }
    }

    @InterfaceC9871jM0(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String strM8007d = UO1.m8007d(readableArray);
        if (TextUtils.equals(strM8007d, this.f6012X)) {
            return;
        }
        this.f6012X = strM8007d;
        mo2191t();
    }

    @InterfaceC9871jM0(name = "fontWeight")
    public void setFontWeight(String str) {
        int iM8008e = UO1.m8008e(str);
        if (iM8008e != this.f6010V) {
            this.f6010V = iM8008e;
            mo2191t();
        }
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.f6006R = z;
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.f5989A.f34949d = f;
        mo2191t();
    }

    @InterfaceC9871jM0(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.f5989A.f34948c = f;
        mo2191t();
    }

    @InterfaceC9871jM0(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        C9846j91 c9846j91 = this.f5989A;
        if (f != c9846j91.f34950e) {
            if (f == 0.0f || f >= 1.0f) {
                c9846j91.f34950e = f;
            } else {
                AbstractC3929dS.m17683p("ReactNative");
                c9846j91.f34950e = Float.NaN;
            }
            mo2191t();
        }
    }

    @InterfaceC9871jM0(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        if (f != this.f6008T) {
            this.f6008T = f;
            mo2191t();
        }
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.f5996H = i;
        mo2191t();
    }

    @InterfaceC9871jM0(name = "role")
    public void setRole(String str) {
        EnumC11655xJ0 enumC11655xJ0;
        if (mo1653c()) {
            EnumC11655xJ0[] enumC11655xJ0ArrValues = EnumC11655xJ0.values();
            int length = enumC11655xJ0ArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC11655xJ0 = null;
                    break;
                }
                enumC11655xJ0 = enumC11655xJ0ArrValues[i];
                if (enumC11655xJ0.name().equalsIgnoreCase(str)) {
                    break;
                } else {
                    i++;
                }
            }
            this.f5995G = enumC11655xJ0;
            mo2191t();
        }
    }

    @InterfaceC9871jM0(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f5999K = 1;
            }
            this.f5997I = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f5999K = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f5997I = 0;
            } else if ("left".equals(str)) {
                this.f5997I = 3;
            } else if ("right".equals(str)) {
                this.f5997I = 5;
            } else if ("center".equals(str)) {
                this.f5997I = 1;
            } else {
                "Invalid textAlign: ".concat(str);
                AbstractC3929dS.m17683p("ReactNative");
                this.f5997I = 0;
            }
        }
        mo2191t();
    }

    @InterfaceC9871jM0(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.f5998J = 1;
        } else if ("simple".equals(str)) {
            this.f5998J = 0;
        } else if ("balanced".equals(str)) {
            this.f5998J = 2;
        } else {
            "Invalid textBreakStrategy: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            this.f5998J = 1;
        }
        mo2191t();
    }

    @InterfaceC9871jM0(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f6004P = false;
        this.f6005Q = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f6004P = true;
                } else if ("line-through".equals(str2)) {
                    this.f6005Q = true;
                }
            }
        }
        mo2191t();
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.f6003O) {
            this.f6003O = i;
            mo2191t();
        }
    }

    @InterfaceC9871jM0(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f6000L = 0.0f;
        this.f6001M = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey(Snapshot.WIDTH) && !readableMap.isNull(Snapshot.WIDTH)) {
                this.f6000L = AbstractC11406vL1.m25403b((float) readableMap.getDouble(Snapshot.WIDTH));
            }
            if (readableMap.hasKey(Snapshot.HEIGHT) && !readableMap.isNull(Snapshot.HEIGHT)) {
                this.f6001M = AbstractC11406vL1.m25403b((float) readableMap.getDouble(Snapshot.HEIGHT));
            }
        }
        mo2191t();
    }

    @InterfaceC9871jM0(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.f6002N) {
            this.f6002N = f;
            mo2191t();
        }
    }

    @InterfaceC9871jM0(name = "textTransform")
    public void setTextTransform(String str) {
        C9846j91 c9846j91 = this.f5989A;
        if (str == null) {
            c9846j91.f34952g = 5;
        } else if (LocalNotification.Importance.NONE.equals(str)) {
            c9846j91.f34952g = 1;
        } else if ("uppercase".equals(str)) {
            c9846j91.f34952g = 2;
        } else if ("lowercase".equals(str)) {
            c9846j91.f34952g = 3;
        } else if ("capitalize".equals(str)) {
            c9846j91.f34952g = 4;
        } else {
            "Invalid textTransform: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            c9846j91.f34952g = 5;
        }
        mo2191t();
    }
}
