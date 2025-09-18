package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.facebook.yoga.YogaValue;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class KJ0 extends C5742lh0 {
    public int C;
    public int E;
    public HashMap Z;
    public final InterfaceC3569eN0 z;
    public boolean B = false;
    public boolean D = false;
    public EnumC7769wJ0 F = null;
    public EnumC7959xJ0 G = null;
    public int H = -1;
    public int I = 0;
    public int J = 1;
    public int K = 0;
    public float L = 0.0f;
    public float M = 0.0f;
    public float N = 0.0f;
    public int O = 1426063360;
    public boolean P = false;
    public boolean Q = false;
    public boolean R = true;
    public boolean S = false;
    public float T = 0.0f;
    public int U = -1;
    public int V = -1;
    public String W = null;
    public String X = null;
    public boolean Y = false;
    public final C5259j91 A = new C5259j91();

    public KJ0(InterfaceC3569eN0 interfaceC3569eN0) {
        this.z = interfaceC3569eN0;
    }

    public static void J(KJ0 kj0, SpannableStringBuilder spannableStringBuilder, ArrayList arrayList, C5259j91 c5259j91, boolean z, HashMap map, int i) {
        C5259j91 c5259j912;
        EM0 em0;
        C5259j91 c5259j913;
        int i2;
        float fE;
        float f;
        YogaNodeJNIBase yogaNodeJNIBase;
        KJ0 kj02 = kj0;
        if (c5259j91 != null) {
            C5259j91 c5259j914 = kj02.A;
            c5259j912 = new C5259j91();
            c5259j912.a = c5259j91.a;
            c5259j912.b = !Float.isNaN(c5259j914.b) ? c5259j914.b : c5259j91.b;
            c5259j912.c = !Float.isNaN(c5259j914.c) ? c5259j914.c : c5259j91.c;
            c5259j912.d = !Float.isNaN(c5259j914.d) ? c5259j914.d : c5259j91.d;
            c5259j912.e = !Float.isNaN(c5259j914.e) ? c5259j914.e : c5259j91.e;
            c5259j912.f = !Float.isNaN(c5259j914.f) ? c5259j914.f : c5259j91.f;
            int i3 = c5259j914.g;
            if (i3 == 5) {
                i3 = c5259j91.g;
            }
            c5259j912.g = i3;
        } else {
            c5259j912 = kj02.A;
        }
        C5259j91 c5259j915 = c5259j912;
        int iK = kj0.k();
        int i4 = 0;
        while (i4 < iK) {
            EM0 em0J = kj02.j(i4);
            if (em0J instanceof C5679lM0) {
                spannableStringBuilder.append((CharSequence) F91.p(c5259j915.g, ((C5679lM0) em0J).y));
                em0 = em0J;
            } else if (em0J instanceof KJ0) {
                em0 = em0J;
                J((KJ0) em0J, spannableStringBuilder, arrayList, c5259j915, z, map, spannableStringBuilder.length());
            } else {
                em0 = em0J;
                if (em0 instanceof C3986gZ) {
                    spannableStringBuilder.append("0");
                    int length = spannableStringBuilder.length() - 1;
                    int length2 = spannableStringBuilder.length();
                    C3986gZ c3986gZ = (C3986gZ) em0;
                    S91 s91 = c3986gZ.d;
                    UN1.c(s91);
                    i2 = iK;
                    c5259j913 = c5259j915;
                    arrayList.add(new C6673qZ0(length, length2, new C4177hZ(s91.getResources(), (int) Math.ceil(c3986gZ.F), (int) Math.ceil(c3986gZ.D), c3986gZ.G, c3986gZ.z, c3986gZ.A, c3986gZ.B, c3986gZ.C, c3986gZ.E)));
                } else {
                    c5259j913 = c5259j915;
                    i2 = iK;
                    if (!z) {
                        throw new C2262b60("Unexpected view type nested under a <Text> or <TextInput> node: " + em0.getClass());
                    }
                    int i5 = em0.a;
                    YogaNodeJNIBase yogaNodeJNIBase2 = em0.u;
                    YogaValue yogaValueO = YogaNodeJNIBase.o(YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase2.e));
                    YogaValue yogaValueO2 = YogaNodeJNIBase.o(YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase2.e));
                    if (yogaValueO.b == 2 && yogaValueO2.b == 2) {
                        f = yogaValueO.a;
                        fE = yogaValueO2.a;
                    } else {
                        em0.h(Float.NaN, Float.NaN);
                        float fH = yogaNodeJNIBase2.h();
                        fE = yogaNodeJNIBase2.e();
                        f = fH;
                    }
                    spannableStringBuilder.append("0");
                    arrayList.add(new C6673qZ0(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new C6786r91(i5, (int) f, (int) fE)));
                    map.put(Integer.valueOf(i5), em0);
                }
                em0.f = false;
                if (!em0.p() && (yogaNodeJNIBase = em0.u) != null) {
                    yogaNodeJNIBase.l();
                }
                i4++;
                kj02 = kj0;
                iK = i2;
                c5259j915 = c5259j913;
            }
            c5259j913 = c5259j915;
            i2 = iK;
            em0.f = false;
            if (!em0.p()) {
            }
            i4++;
            kj02 = kj0;
            iK = i2;
            c5259j915 = c5259j913;
        }
        C5259j91 c5259j916 = c5259j915;
        int length3 = spannableStringBuilder.length();
        if (length3 >= i) {
            if (kj0.B) {
                arrayList.add(new C6673qZ0(i, length3, new C7772wK0(kj0.C)));
            }
            if (kj0.D) {
                arrayList.add(new C6673qZ0(i, length3, new JJ0(kj0.E)));
            }
            EnumC7959xJ0 enumC7959xJ0 = kj0.G;
            if (enumC7959xJ0 == null ? kj0.F == EnumC7769wJ0.d : enumC7959xJ0 == EnumC7959xJ0.a) {
                arrayList.add(new C6673qZ0(i, length3, new NJ0(kj0.a)));
            }
            float fB = c5259j916.b();
            if (!Float.isNaN(fB) && (c5259j91 == null || c5259j91.b() != fB)) {
                arrayList.add(new C6673qZ0(i, length3, new JB(fB)));
            }
            int iA = c5259j916.a();
            if (c5259j91 == null || c5259j91.a() != iA) {
                arrayList.add(new C6673qZ0(i, length3, new C7006sJ0(iA)));
            }
            if (kj0.U != -1 || kj0.V != -1 || kj0.W != null) {
                int i6 = kj0.U;
                int i7 = kj0.V;
                String str = kj0.X;
                String str2 = kj0.W;
                S91 s912 = kj0.d;
                UN1.c(s912);
                arrayList.add(new C6673qZ0(i, length3, new QB(i6, i7, str, str2, s912.getAssets())));
            }
            if (kj0.P) {
                arrayList.add(new C6673qZ0(i, length3, new C3760fN0()));
            }
            if (kj0.Q) {
                arrayList.add(new C6673qZ0(i, length3, new MM0()));
            }
            if ((kj0.L != 0.0f || kj0.M != 0.0f || kj0.N != 0.0f) && Color.alpha(kj0.O) != 0) {
                arrayList.add(new C6673qZ0(i, length3, new KZ0(kj0.L, kj0.M, kj0.N, kj0.O)));
            }
            float fC = c5259j916.c();
            if (!Float.isNaN(fC) && (c5259j91 == null || c5259j91.c() != fC)) {
                arrayList.add(new C6673qZ0(i, length3, new KB(fC)));
            }
            arrayList.add(new C6673qZ0(i, length3, new TM0(kj0.a)));
        }
    }

    public final SpannableStringBuilder K(KJ0 kj0, String str, boolean z, C6846rT1 c6846rT1) {
        int i;
        UN1.b((z && c6846rT1 == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) F91.p(kj0.A.g, str));
        }
        J(kj0, spannableStringBuilder, arrayList, null, z, map, 0);
        kj0.Y = false;
        kj0.Z = map;
        float f = Float.NaN;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C6673qZ0 c6673qZ0 = (C6673qZ0) arrayList.get((arrayList.size() - i2) - 1);
            LM0 lm0 = c6673qZ0.c;
            boolean z2 = lm0 instanceof C4177hZ;
            if (z2 || (lm0 instanceof C6786r91)) {
                if (z2) {
                    i = ((C4177hZ) lm0).e;
                    kj0.Y = true;
                } else {
                    C6786r91 c6786r91 = (C6786r91) lm0;
                    DM0 dm0 = (DM0) map.get(Integer.valueOf(c6786r91.a));
                    c6846rT1.getClass();
                    EM0 em0 = (EM0) dm0;
                    if (em0.j) {
                        c6846rT1.I(dm0, null);
                    }
                    em0.i = kj0;
                    i = c6786r91.c;
                }
                if (Float.isNaN(f) || i > f) {
                    f = i;
                }
            }
            c6673qZ0.a(spannableStringBuilder, i2);
        }
        kj0.A.f = f;
        InterfaceC3569eN0 interfaceC3569eN0 = this.z;
        if (interfaceC3569eN0 != null) {
            ((EE) interfaceC3569eN0).d(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    @InterfaceC5297jM0(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (c()) {
            this.F = EnumC7769wJ0.a(str);
            t();
        }
    }

    @InterfaceC5297jM0(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.S) {
            this.S = z;
            t();
        }
    }

    @InterfaceC5297jM0(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        C5259j91 c5259j91 = this.A;
        if (z != c5259j91.a) {
            c5259j91.a = z;
            t();
        }
    }

    @InterfaceC5297jM0(customType = RemoteMessageAttributes.COLOR, name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (c()) {
            boolean z = num != null;
            this.D = z;
            if (z) {
                this.E = num.intValue();
            }
            t();
        }
    }

    @InterfaceC5297jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
    public void setColor(Integer num) {
        boolean z = num != null;
        this.B = z;
        if (z) {
            this.C = num.intValue();
        }
        t();
    }

    @InterfaceC5297jM0(name = "fontFamily")
    public void setFontFamily(String str) {
        this.W = str;
        t();
    }

    @InterfaceC5297jM0(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.A.b = f;
        t();
    }

    @InterfaceC5297jM0(name = "fontStyle")
    public void setFontStyle(String str) {
        int iC = UO1.c(str);
        if (iC != this.U) {
            this.U = iC;
            t();
        }
    }

    @InterfaceC5297jM0(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String strD = UO1.d(readableArray);
        if (TextUtils.equals(strD, this.X)) {
            return;
        }
        this.X = strD;
        t();
    }

    @InterfaceC5297jM0(name = "fontWeight")
    public void setFontWeight(String str) {
        int iE = UO1.e(str);
        if (iE != this.V) {
            this.V = iE;
            t();
        }
    }

    @InterfaceC5297jM0(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.R = z;
    }

    @InterfaceC5297jM0(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.A.d = f;
        t();
    }

    @InterfaceC5297jM0(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.A.c = f;
        t();
    }

    @InterfaceC5297jM0(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        C5259j91 c5259j91 = this.A;
        if (f != c5259j91.e) {
            if (f == 0.0f || f >= 1.0f) {
                c5259j91.e = f;
            } else {
                AbstractC3393dS.p("ReactNative");
                c5259j91.e = Float.NaN;
            }
            t();
        }
    }

    @InterfaceC5297jM0(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        if (f != this.T) {
            this.T = f;
            t();
        }
    }

    @InterfaceC5297jM0(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.H = i;
        t();
    }

    @InterfaceC5297jM0(name = "role")
    public void setRole(String str) {
        EnumC7959xJ0 enumC7959xJ0;
        if (c()) {
            EnumC7959xJ0[] enumC7959xJ0ArrValues = EnumC7959xJ0.values();
            int length = enumC7959xJ0ArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC7959xJ0 = null;
                    break;
                }
                enumC7959xJ0 = enumC7959xJ0ArrValues[i];
                if (enumC7959xJ0.name().equalsIgnoreCase(str)) {
                    break;
                } else {
                    i++;
                }
            }
            this.G = enumC7959xJ0;
            t();
        }
    }

    @InterfaceC5297jM0(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.K = 1;
            }
            this.I = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.K = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.I = 0;
            } else if ("left".equals(str)) {
                this.I = 3;
            } else if ("right".equals(str)) {
                this.I = 5;
            } else if ("center".equals(str)) {
                this.I = 1;
            } else {
                "Invalid textAlign: ".concat(str);
                AbstractC3393dS.p("ReactNative");
                this.I = 0;
            }
        }
        t();
    }

    @InterfaceC5297jM0(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.J = 1;
        } else if ("simple".equals(str)) {
            this.J = 0;
        } else if ("balanced".equals(str)) {
            this.J = 2;
        } else {
            "Invalid textBreakStrategy: ".concat(str);
            AbstractC3393dS.p("ReactNative");
            this.J = 1;
        }
        t();
    }

    @InterfaceC5297jM0(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.P = false;
        this.Q = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.P = true;
                } else if ("line-through".equals(str2)) {
                    this.Q = true;
                }
            }
        }
        t();
    }

    @InterfaceC5297jM0(customType = RemoteMessageAttributes.COLOR, defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.O) {
            this.O = i;
            t();
        }
    }

    @InterfaceC5297jM0(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.L = 0.0f;
        this.M = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey(Snapshot.WIDTH) && !readableMap.isNull(Snapshot.WIDTH)) {
                this.L = AbstractC7586vL1.b((float) readableMap.getDouble(Snapshot.WIDTH));
            }
            if (readableMap.hasKey(Snapshot.HEIGHT) && !readableMap.isNull(Snapshot.HEIGHT)) {
                this.M = AbstractC7586vL1.b((float) readableMap.getDouble(Snapshot.HEIGHT));
            }
        }
        t();
    }

    @InterfaceC5297jM0(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.N) {
            this.N = f;
            t();
        }
    }

    @InterfaceC5297jM0(name = "textTransform")
    public void setTextTransform(String str) {
        C5259j91 c5259j91 = this.A;
        if (str == null) {
            c5259j91.g = 5;
        } else if (LocalNotification.Importance.NONE.equals(str)) {
            c5259j91.g = 1;
        } else if ("uppercase".equals(str)) {
            c5259j91.g = 2;
        } else if ("lowercase".equals(str)) {
            c5259j91.g = 3;
        } else if ("capitalize".equals(str)) {
            c5259j91.g = 4;
        } else {
            "Invalid textTransform: ".concat(str);
            AbstractC3393dS.p("ReactNative");
            c5259j91.g = 5;
        }
        t();
    }
}
