package p000;

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

    /* renamed from: H */
    public static final float[] f5457H = new float[4];

    /* renamed from: I */
    public static final Matrix f5458I = new Matrix();

    /* renamed from: A */
    public HK0 f5459A;

    /* renamed from: B */
    public InterfaceC3899cz f5460B;

    /* renamed from: C */
    public final Object f5461C;

    /* renamed from: D */
    public int f5462D;

    /* renamed from: E */
    public boolean f5463E;

    /* renamed from: F */
    public ReadableMap f5464F;

    /* renamed from: G */
    public float f5465G;

    /* renamed from: h */
    public EnumC10993s70 f5466h;

    /* renamed from: i */
    public final LinkedList f5467i;

    /* renamed from: j */
    public C11121t70 f5468j;

    /* renamed from: k */
    public C11121t70 f5469k;

    /* renamed from: l */
    public Drawable f5470l;

    /* renamed from: m */
    public RunnableC4127gc f5471m;

    /* renamed from: n */
    public FT0 f5472n;

    /* renamed from: o */
    public int f5473o;

    /* renamed from: p */
    public int f5474p;

    /* renamed from: q */
    public int f5475q;

    /* renamed from: r */
    public float f5476r;

    /* renamed from: s */
    public float f5477s;

    /* renamed from: t */
    public float[] f5478t;

    /* renamed from: u */
    public InterfaceC11297uV0 f5479u;

    /* renamed from: v */
    public Shader.TileMode f5480v;

    /* renamed from: w */
    public boolean f5481w;

    /* renamed from: x */
    public final AbstractC0881O f5482x;

    /* renamed from: y */
    public IK0 f5483y;

    /* renamed from: z */
    public C10027ka0 f5484z;

    public JK0(S91 s91, AbstractC0881O abstractC0881O, Object obj) {
        NT0 nt0 = new NT0();
        nt0.f7799a = 2;
        nt0.f7800b = null;
        nt0.f7801c = 0;
        nt0.f7802d = 0.0f;
        nt0.f7803e = 0;
        nt0.f7804f = false;
        nt0.f7800b = new float[8];
        Arrays.fill(nt0.f7800b, 0.0f);
        nt0.f7804f = true;
        G00 g00 = new G00(s91.getResources());
        g00.f3523g = nt0;
        F00 f00 = new F00(g00);
        super(s91);
        setHierarchy(f00);
        this.f5466h = EnumC10993s70.f42267a;
        this.f5467i = new LinkedList();
        this.f5473o = 0;
        this.f5477s = Float.NaN;
        this.f5479u = C11041sV0.f42461d;
        this.f5480v = Shader.TileMode.CLAMP;
        this.f5462D = -1;
        this.f5465G = 1.0f;
        this.f5482x = abstractC0881O;
        this.f5461C = obj;
        setLegacyVisibilityHandlingEnabled(true);
    }

    private C9115dS0 getResizeOptions() {
        int iRound = Math.round(getWidth() * this.f5465G);
        int iRound2 = Math.round(getHeight() * this.f5465G);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new C9115dS0(iRound, iRound2);
    }

    /* renamed from: c */
    public final void m4286c(float[] fArr) {
        float f = !AbstractC11619x12.m25735a(this.f5477s) ? this.f5477s : 0.0f;
        float[] fArr2 = this.f5478t;
        fArr[0] = (fArr2 == null || AbstractC11619x12.m25735a(fArr2[0])) ? f : this.f5478t[0];
        float[] fArr3 = this.f5478t;
        fArr[1] = (fArr3 == null || AbstractC11619x12.m25735a(fArr3[1])) ? f : this.f5478t[1];
        float[] fArr4 = this.f5478t;
        fArr[2] = (fArr4 == null || AbstractC11619x12.m25735a(fArr4[2])) ? f : this.f5478t[2];
        float[] fArr5 = this.f5478t;
        if (fArr5 != null && !AbstractC11619x12.m25735a(fArr5[3])) {
            f = this.f5478t[3];
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4287d() {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.JK0.m4287d():void");
    }

    public C11121t70 getImageSource() {
        return this.f5468j;
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
        if (!this.f5481w && this.f5467i.size() <= 1 && this.f5480v == Shader.TileMode.CLAMP) {
            z = false;
        }
        this.f5481w = z;
        m4287d();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.f5473o != i) {
            this.f5473o = i;
            this.f5472n = new FT0(i);
            this.f5481w = true;
        }
    }

    public void setBlurRadius(float f) {
        int iM25403b = ((int) AbstractC11406vL1.m25403b(f)) / 2;
        if (iM25403b == 0) {
            this.f5484z = null;
        } else {
            this.f5484z = new C10027ka0(iM25403b);
        }
        this.f5481w = true;
    }

    public void setBorderColor(int i) {
        if (this.f5474p != i) {
            this.f5474p = i;
            this.f5481w = true;
        }
    }

    public void setBorderRadius(float f) {
        if (AbstractC9828j12.m21957a(this.f5477s, f)) {
            return;
        }
        this.f5477s = f;
        this.f5481w = true;
    }

    public void setBorderWidth(float f) {
        float fM25403b = AbstractC11406vL1.m25403b(f);
        if (AbstractC9828j12.m21957a(this.f5476r, fM25403b)) {
            return;
        }
        this.f5476r = fM25403b;
        this.f5481w = true;
    }

    public void setControllerListener(InterfaceC3899cz interfaceC3899cz) {
        this.f5460B = interfaceC3899cz;
        this.f5481w = true;
        m4287d();
    }

    public void setDefaultSource(String str) {
        Drawable drawableM23999a = C10779qS0.f40878b.m23999a(getContext(), str);
        if (EI1.m2118a(this.f5470l, drawableM23999a)) {
            return;
        }
        this.f5470l = drawableM23999a;
        this.f5481w = true;
    }

    public void setFadeDuration(int i) {
        this.f5462D = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.f5464F = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        RunnableC4127gc runnableC4127gc;
        Drawable drawableM23999a = C10779qS0.f40878b.m23999a(getContext(), str);
        if (drawableM23999a != null) {
            runnableC4127gc = new RunnableC4127gc(drawableM23999a);
            runnableC4127gc.f27879f = 0.0f;
            runnableC4127gc.f27880g = false;
            runnableC4127gc.f27877d = 1000;
            runnableC4127gc.f27878e = true;
        } else {
            runnableC4127gc = null;
        }
        if (EI1.m2118a(this.f5471m, runnableC4127gc)) {
            return;
        }
        this.f5471m = runnableC4127gc;
        this.f5481w = true;
    }

    public void setOverlayColor(int i) {
        if (this.f5475q != i) {
            this.f5475q = i;
            this.f5481w = true;
        }
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.f5463E = z;
    }

    public void setResizeMethod(EnumC10993s70 enumC10993s70) {
        if (this.f5466h != enumC10993s70) {
            this.f5466h = enumC10993s70;
            this.f5481w = true;
        }
    }

    public void setResizeMultiplier(float f) {
        if (Math.abs(this.f5465G - f) > 1.0E-4f) {
            this.f5465G = f;
            this.f5481w = true;
        }
    }

    public void setScaleType(InterfaceC11297uV0 interfaceC11297uV0) {
        if (this.f5479u != interfaceC11297uV0) {
            this.f5479u = interfaceC11297uV0;
            this.f5481w = true;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (z == (this.f5459A != null)) {
            return;
        }
        if (z) {
            this.f5459A = new HK0(this, OZ1.m6091b((ReactContext) getContext(), getId()));
        } else {
            this.f5459A = null;
        }
        this.f5481w = true;
    }

    public void setSource(ReadableArray readableArray) {
        LinkedList linkedList = new LinkedList();
        if (readableArray == null || readableArray.size() == 0) {
            linkedList.add(C11121t70.m24840a(getContext()));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                C11121t70 c11121t70 = new C11121t70(getContext(), map.getString("uri"));
                if (Uri.EMPTY.equals(c11121t70.f42840b)) {
                    map.getString("uri");
                    c11121t70 = C11121t70.m24840a(getContext());
                }
                linkedList.add(c11121t70);
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map2 = readableArray.getMap(i);
                    C11121t70 c11121t702 = new C11121t70(getContext(), map2.getString("uri"), map2.getDouble(Snapshot.WIDTH), map2.getDouble(Snapshot.HEIGHT));
                    if (Uri.EMPTY.equals(c11121t702.f42840b)) {
                        map2.getString("uri");
                        c11121t702 = C11121t70.m24840a(getContext());
                    }
                    linkedList.add(c11121t702);
                }
            }
        }
        LinkedList linkedList2 = this.f5467i;
        if (linkedList2.equals(linkedList)) {
            return;
        }
        linkedList2.clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add((C11121t70) it.next());
        }
        this.f5481w = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        if (this.f5480v != tileMode) {
            this.f5480v = tileMode;
            if (tileMode != Shader.TileMode.CLAMP) {
                this.f5483y = new IK0(this);
            } else {
                this.f5483y = null;
            }
            this.f5481w = true;
        }
    }
}
