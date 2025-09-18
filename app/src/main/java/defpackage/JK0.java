package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class JK0 extends I00 {
    public static final float[] H = new float[4];
    public static final Matrix I = new Matrix();
    public HK0 A;
    public InterfaceC3301cz B;
    public final Object C;
    public int D;
    public boolean E;
    public ReadableMap F;
    public float G;
    public EnumC6970s70 h;
    public final LinkedList i;
    public C7161t70 j;
    public C7161t70 k;
    public Drawable l;
    public RunnableC3995gc m;
    public FT0 n;
    public int o;
    public int p;
    public int q;
    public float r;
    public float s;
    public float[] t;
    public InterfaceC7424uV0 u;
    public Shader.TileMode v;
    public boolean w;
    public final O x;
    public IK0 y;
    public C5530ka0 z;

    public JK0(S91 s91, O o, Object obj) {
        NT0 nt0 = new NT0();
        nt0.a = 2;
        nt0.b = null;
        nt0.c = 0;
        nt0.d = 0.0f;
        nt0.e = 0;
        nt0.f = false;
        nt0.b = new float[8];
        Arrays.fill(nt0.b, 0.0f);
        nt0.f = true;
        G00 g00 = new G00(s91.getResources());
        g00.g = nt0;
        F00 f00 = new F00(g00);
        super(s91);
        setHierarchy(f00);
        this.h = EnumC6970s70.a;
        this.i = new LinkedList();
        this.o = 0;
        this.s = Float.NaN;
        this.u = C7042sV0.d;
        this.v = Shader.TileMode.CLAMP;
        this.D = -1;
        this.G = 1.0f;
        this.x = o;
        this.C = obj;
        setLegacyVisibilityHandlingEnabled(true);
    }

    private C3394dS0 getResizeOptions() {
        int iRound = Math.round(getWidth() * this.G);
        int iRound2 = Math.round(getHeight() * this.G);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new C3394dS0(iRound, iRound2);
    }

    public final void c(float[] fArr) {
        float f = !AbstractC7905x12.a(this.s) ? this.s : 0.0f;
        float[] fArr2 = this.t;
        fArr[0] = (fArr2 == null || AbstractC7905x12.a(fArr2[0])) ? f : this.t[0];
        float[] fArr3 = this.t;
        fArr[1] = (fArr3 == null || AbstractC7905x12.a(fArr3[1])) ? f : this.t[1];
        float[] fArr4 = this.t;
        fArr[2] = (fArr4 == null || AbstractC7905x12.a(fArr4[2])) ? f : this.t[2];
        float[] fArr5 = this.t;
        if (fArr5 != null && !AbstractC7905x12.a(fArr5[3])) {
            f = this.t[3];
        }
        fArr[3] = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e8 A[EDGE_INSN: B:194:0x02e8->B:150:0x02e8 BREAK  A[LOOP:0: B:127:0x0285->B:149:0x02e6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [qC0] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JK0.d():void");
    }

    public C7161t70 getImageSource() {
        return this.j;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        boolean z = true;
        if (!this.w && this.i.size() <= 1 && this.v == Shader.TileMode.CLAMP) {
            z = false;
        }
        this.w = z;
        d();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.o != i) {
            this.o = i;
            this.n = new FT0(i);
            this.w = true;
        }
    }

    public void setBlurRadius(float f) {
        int iB = ((int) AbstractC7586vL1.b(f)) / 2;
        if (iB == 0) {
            this.z = null;
        } else {
            this.z = new C5530ka0(iB);
        }
        this.w = true;
    }

    public void setBorderColor(int i) {
        if (this.p != i) {
            this.p = i;
            this.w = true;
        }
    }

    public void setBorderRadius(float f) {
        if (AbstractC5233j12.a(this.s, f)) {
            return;
        }
        this.s = f;
        this.w = true;
    }

    public void setBorderWidth(float f) {
        float fB = AbstractC7586vL1.b(f);
        if (AbstractC5233j12.a(this.r, fB)) {
            return;
        }
        this.r = fB;
        this.w = true;
    }

    public void setControllerListener(InterfaceC3301cz interfaceC3301cz) {
        this.B = interfaceC3301cz;
        this.w = true;
        d();
    }

    public void setDefaultSource(String str) {
        Drawable drawableA = C6652qS0.b.a(getContext(), str);
        if (EI1.a(this.l, drawableA)) {
            return;
        }
        this.l = drawableA;
        this.w = true;
    }

    public void setFadeDuration(int i) {
        this.D = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.F = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        RunnableC3995gc runnableC3995gc;
        Drawable drawableA = C6652qS0.b.a(getContext(), str);
        if (drawableA != null) {
            runnableC3995gc = new RunnableC3995gc(drawableA);
            runnableC3995gc.f = 0.0f;
            runnableC3995gc.g = false;
            runnableC3995gc.d = 1000;
            runnableC3995gc.e = true;
        } else {
            runnableC3995gc = null;
        }
        if (EI1.a(this.m, runnableC3995gc)) {
            return;
        }
        this.m = runnableC3995gc;
        this.w = true;
    }

    public void setOverlayColor(int i) {
        if (this.q != i) {
            this.q = i;
            this.w = true;
        }
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.E = z;
    }

    public void setResizeMethod(EnumC6970s70 enumC6970s70) {
        if (this.h != enumC6970s70) {
            this.h = enumC6970s70;
            this.w = true;
        }
    }

    public void setResizeMultiplier(float f) {
        if (Math.abs(this.G - f) > 1.0E-4f) {
            this.G = f;
            this.w = true;
        }
    }

    public void setScaleType(InterfaceC7424uV0 interfaceC7424uV0) {
        if (this.u != interfaceC7424uV0) {
            this.u = interfaceC7424uV0;
            this.w = true;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (z == (this.A != null)) {
            return;
        }
        if (z) {
            this.A = new HK0(this, OZ1.b((ReactContext) getContext(), getId()));
        } else {
            this.A = null;
        }
        this.w = true;
    }

    public void setSource(ReadableArray readableArray) {
        LinkedList linkedList = new LinkedList();
        if (readableArray == null || readableArray.size() == 0) {
            linkedList.add(C7161t70.a(getContext()));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                C7161t70 c7161t70 = new C7161t70(getContext(), map.getString("uri"));
                if (Uri.EMPTY.equals(c7161t70.b)) {
                    map.getString("uri");
                    c7161t70 = C7161t70.a(getContext());
                }
                linkedList.add(c7161t70);
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map2 = readableArray.getMap(i);
                    C7161t70 c7161t702 = new C7161t70(getContext(), map2.getString("uri"), map2.getDouble(Snapshot.WIDTH), map2.getDouble(Snapshot.HEIGHT));
                    if (Uri.EMPTY.equals(c7161t702.b)) {
                        map2.getString("uri");
                        c7161t702 = C7161t70.a(getContext());
                    }
                    linkedList.add(c7161t702);
                }
            }
        }
        LinkedList linkedList2 = this.i;
        if (linkedList2.equals(linkedList)) {
            return;
        }
        linkedList2.clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add((C7161t70) it.next());
        }
        this.w = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        if (this.v != tileMode) {
            this.v = tileMode;
            if (tileMode != Shader.TileMode.CLAMP) {
                this.y = new IK0(this);
            } else {
                this.y = null;
            }
            this.w = true;
        }
    }
}
