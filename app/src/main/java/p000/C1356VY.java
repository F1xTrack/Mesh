package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Range;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.Feature;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: VY */
/* loaded from: classes.dex */
public final class C1356VY implements InterfaceC0468HQ, InterfaceC9875jO0, InterfaceC6949uR, InterfaceC6839sh, InterfaceC9129dZ0 {

    /* renamed from: a */
    public final /* synthetic */ int f12610a;

    /* renamed from: b */
    public int f12611b;

    /* renamed from: c */
    public Object f12612c;

    /* renamed from: d */
    public Object f12613d;

    public C1356VY() {
        this.f12610a = 21;
        this.f12612c = new Object[8];
        this.f12611b = 0;
    }

    /* renamed from: V */
    private final /* synthetic */ void m8461V() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x01d1, code lost:
    
        r0 = new p000.C4238iN(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01d8, code lost:
    
        if (r0 == null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x01dc, code lost:
    
        if (r19 == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01de, code lost:
    
        r0 = new p000.C4238iN(r6, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01e4, code lost:
    
        r0 = new p000.C4238iN(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01ea, code lost:
    
        if (r8 == 1) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01ed, code lost:
    
        if (r8 == 2) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01f1, code lost:
    
        if (r5 == 1) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01f3, code lost:
    
        if (r5 == 2) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01f5, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01f7, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01fa, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01fd, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0200, code lost:
    
        r1 = 0;
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, (int[]) r0.f29113b, (float[]) r0.f29114c, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0217, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, (int[]) r0.f29113b, (float[]) r0.f29114c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x022a, code lost:
    
        r9 = r22;
        r15 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0232, code lost:
    
        if (r24 <= 0.0f) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0237, code lost:
    
        if (r5 == 1) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x023a, code lost:
    
        if (r5 == 2) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x023c, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0241, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0244, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0247, code lost:
    
        r3 = new android.graphics.RadialGradient(r9, r15, r24, (int[]) r0.f29113b, (float[]) r0.f29114c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0264, code lost:
    
        return new p000.C1356VY(r3, (android.content.res.ColorStateList) null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x026c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C1356VY m8462t(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1356VY.m8462t(android.content.res.Resources, int, android.content.res.Resources$Theme):VY");
    }

    /* renamed from: A */
    public long m8463A(C7000vF c7000vF) throws EOFException, InterruptedIOException {
        long j;
        C1164SV c1164sv;
        C1290UV c1290uv;
        boolean zM17817a;
        int iM25377g;
        while (true) {
            long jMo3624j = c7000vF.mo3624j();
            j = c7000vF.f44294c;
            long j2 = j - 6;
            c1164sv = (C1164SV) this.f12613d;
            c1290uv = (C1290UV) this.f12612c;
            if (jMo3624j >= j2) {
                break;
            }
            long jMo3624j2 = c7000vF.mo3624j();
            byte[] bArr = new byte[2];
            c7000vF.mo3620f(bArr, 0, 2, false);
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i2 = this.f12611b;
            if (i != i2) {
                c7000vF.f44297f = 0;
                c7000vF.m25375a((int) (jMo3624j2 - c7000vF.f44295d), false);
                zM17817a = false;
            } else {
                C9591hA0 c9591hA0 = new C9591hA0(16);
                System.arraycopy(bArr, 0, c9591hA0.f28293a, 0, 2);
                byte[] bArr2 = c9591hA0.f28293a;
                int i3 = 0;
                for (int i4 = 2; i3 < 14 && (iM25377g = c7000vF.m25377g(bArr2, i4 + i3, 14 - i3)) != -1; i4 = 2) {
                    i3 += iM25377g;
                }
                c9591hA0.m18740F(i3);
                c7000vF.f44297f = 0;
                c7000vF.m25375a((int) (jMo3624j2 - c7000vF.f44295d), false);
                zM17817a = AbstractC9188e12.m17817a(c9591hA0, c1290uv, i2, c1164sv);
            }
            if (zM17817a) {
                break;
            }
            c7000vF.m25375a(1, false);
        }
        if (c7000vF.mo3624j() < j - 6) {
            return c1164sv.f10814a;
        }
        c7000vF.m25375a((int) (j - c7000vF.mo3624j()), false);
        return c1290uv.f11827j;
    }

    /* renamed from: B */
    public Object m8464B(int i) {
        SparseArray sparseArray;
        if (this.f12611b == -1) {
            this.f12611b = 0;
        }
        while (true) {
            int i2 = this.f12611b;
            sparseArray = (SparseArray) this.f12612c;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f12611b--;
        }
        while (this.f12611b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f12611b + 1)) {
            this.f12611b++;
        }
        return sparseArray.valueAt(this.f12611b);
    }

    @Override // p000.InterfaceC6839sh
    /* renamed from: B0 */
    public void mo1011B0() {
        switch (this.f12610a) {
            case 9:
                break;
            default:
                byte[] bArr = AbstractC7485Dh1.f2171f;
                C9591hA0 c9591hA0 = (C9591hA0) this.f12613d;
                c9591hA0.getClass();
                c9591hA0.m18739E(bArr.length, bArr);
                break;
        }
    }

    /* renamed from: C */
    public synchronized Object m8465C(InterfaceC4199hl interfaceC4199hl) {
        return ((LinkedHashMap) this.f12613d).get(interfaceC4199hl);
    }

    /* renamed from: D */
    public synchronized int m8466D() {
        return ((LinkedHashMap) this.f12613d).size();
    }

    /* renamed from: E */
    public synchronized Object m8467E() {
        return ((LinkedHashMap) this.f12613d).isEmpty() ? null : ((LinkedHashMap) this.f12613d).keySet().iterator().next();
    }

    /* renamed from: F */
    public synchronized ArrayList m8468F(C0267EE c0267ee) {
        ArrayList arrayList;
        arrayList = new ArrayList(((LinkedHashMap) this.f12613d).entrySet().size());
        for (Map.Entry entry : ((LinkedHashMap) this.f12613d).entrySet()) {
            Object key = entry.getKey();
            c0267ee.getClass();
            InterfaceC4199hl interfaceC4199hl = (InterfaceC4199hl) key;
            Uri uri = (Uri) c0267ee.f2543b;
            O90.m5968f(uri, "$uri");
            O90.m5968f(interfaceC4199hl, "key");
            if (interfaceC4199hl.mo5924a(uri)) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    public C1179Sk m8469G() {
        if (((C1179Sk) this.f12612c) == null) {
            this.f12612c = new C1179Sk(((View) this.f12613d).getContext());
            Drawable background = ((View) this.f12613d).getBackground();
            View view = (View) this.f12613d;
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            view.setBackground(null);
            if (background == null) {
                ((View) this.f12613d).setBackground((C1179Sk) this.f12612c);
            } else {
                ((View) this.f12613d).setBackground(new LayerDrawable(new Drawable[]{(C1179Sk) this.f12612c, background}));
            }
        }
        return (C1179Sk) this.f12612c;
    }

    /* renamed from: H */
    public synchronized int m8470H() {
        return this.f12611b;
    }

    /* renamed from: I */
    public boolean m8471I() {
        ColorStateList colorStateList;
        return ((Shader) this.f12612c) == null && (colorStateList = (ColorStateList) this.f12613d) != null && colorStateList.isStateful();
    }

    /* renamed from: J */
    public void m8472J(C9535gk0 c9535gk0, int i, int i2, C6686qX c6686qX, int i3, Object obj, long j, long j2) {
        m8473K(c9535gk0, new C11081sp0(i, i2, c6686qX, i3, obj, AbstractC7485Dh1.m1819d0(j), AbstractC7485Dh1.m1819d0(j2)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Kp0, java.lang.Object] */
    /* renamed from: K */
    public void m8473K(C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        Iterator it = ((CopyOnWriteArrayList) this.f12613d).iterator();
        while (it.hasNext()) {
            C7812Jp0 c7812Jp0 = (C7812Jp0) it.next();
            AbstractC7485Dh1.m1806U(c7812Jp0.f5713a, new RunnableC7708Hp0(this, c7812Jp0.f5714b, c9535gk0, c11081sp0, 2));
        }
    }

    /* renamed from: L */
    public void m8474L(C9535gk0 c9535gk0, int i) {
        m8475M(c9535gk0, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: M */
    public void m8475M(C9535gk0 c9535gk0, int i, int i2, C6686qX c6686qX, int i3, Object obj, long j, long j2) {
        m8476N(c9535gk0, new C11081sp0(i, i2, c6686qX, i3, obj, AbstractC7485Dh1.m1819d0(j), AbstractC7485Dh1.m1819d0(j2)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Kp0, java.lang.Object] */
    /* renamed from: N */
    public void m8476N(C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        Iterator it = ((CopyOnWriteArrayList) this.f12613d).iterator();
        while (it.hasNext()) {
            C7812Jp0 c7812Jp0 = (C7812Jp0) it.next();
            AbstractC7485Dh1.m1806U(c7812Jp0.f5713a, new RunnableC7708Hp0(this, c7812Jp0.f5714b, c9535gk0, c11081sp0, 1));
        }
    }

    /* renamed from: O */
    public void m8477O(C9535gk0 c9535gk0, int i, int i2, C6686qX c6686qX, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        m8479Q(c9535gk0, new C11081sp0(i, i2, c6686qX, i3, obj, AbstractC7485Dh1.m1819d0(j), AbstractC7485Dh1.m1819d0(j2)), iOException, z);
    }

    /* renamed from: P */
    public void m8478P(C9535gk0 c9535gk0, int i, IOException iOException, boolean z) {
        m8477O(c9535gk0, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    /* renamed from: Q */
    public void m8479Q(C9535gk0 c9535gk0, C11081sp0 c11081sp0, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.f12613d).iterator();
        while (it.hasNext()) {
            C7812Jp0 c7812Jp0 = (C7812Jp0) it.next();
            AbstractC7485Dh1.m1806U(c7812Jp0.f5713a, new RunnableC7760Ip0(this, c7812Jp0.f5714b, c9535gk0, c11081sp0, iOException, z, 0));
        }
    }

    /* renamed from: R */
    public void m8480R(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f12612c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC8704aH0.f15428f;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context, attributeSet, iArr, i);
        AbstractC10944rk1.m24481m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c8539Xo1M9117J.f13982c, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC11918zN1.m26394b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC6737rL.m24315a(drawable);
            }
            if (typedArray.hasValue(2)) {
                A70.m64c(imageView, c8539Xo1M9117J.m9120B(2));
            }
            if (typedArray.hasValue(3)) {
                A70.m65d(imageView, AbstractC6737rL.m24317c(typedArray.getInt(3, -1), null));
            }
            c8539Xo1M9117J.m9130M();
        } catch (Throwable th) {
            c8539Xo1M9117J.m9130M();
            throw th;
        }
    }

    /* renamed from: S */
    public void m8481S(C9535gk0 c9535gk0, int i, int i2, C6686qX c6686qX, int i3, Object obj, long j, long j2) {
        m8482T(c9535gk0, new C11081sp0(i, i2, c6686qX, i3, obj, AbstractC7485Dh1.m1819d0(j), AbstractC7485Dh1.m1819d0(j2)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Kp0, java.lang.Object] */
    /* renamed from: T */
    public void m8482T(C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        Iterator it = ((CopyOnWriteArrayList) this.f12613d).iterator();
        while (it.hasNext()) {
            C7812Jp0 c7812Jp0 = (C7812Jp0) it.next();
            AbstractC7485Dh1.m1806U(c7812Jp0.f5713a, new RunnableC7708Hp0(this, c7812Jp0.f5714b, c9535gk0, c11081sp0, 0));
        }
    }

    /* renamed from: U */
    public void m8483U(Canvas canvas) {
        Path path;
        if (this.f12611b == 1) {
            return;
        }
        Rect rect = new Rect();
        ((View) this.f12613d).getDrawingRect(rect);
        C1179Sk c1179Sk = (C1179Sk) this.f12612c;
        if (c1179Sk == null) {
            canvas.clipRect(rect);
            return;
        }
        if (c1179Sk.m7439f()) {
            c1179Sk.m7446n();
            Path path2 = c1179Sk.f10934d;
            path2.getClass();
            path = new Path(path2);
        } else {
            path = null;
        }
        if (path != null) {
            path.offset(rect.left, rect.top);
            canvas.clipPath(path);
        } else {
            RectF rectFM7438d = c1179Sk.m7438d();
            RectF rectF = new RectF(rectFM7438d.left, rectFM7438d.top, c1179Sk.getBounds().width() - rectFM7438d.right, c1179Sk.getBounds().height() - rectFM7438d.bottom);
            rectF.offset(rect.left, rect.top);
            canvas.clipRect(rectF);
        }
    }

    /* renamed from: W */
    public int m8484W() {
        int i;
        synchronized (this) {
            i = this.f12611b;
            this.f12611b = i + 1;
        }
        return i;
    }

    /* renamed from: X */
    public synchronized void m8485X(InterfaceC4199hl interfaceC4199hl, C1383Vz c1383Vz) {
        Object objRemove = ((LinkedHashMap) this.f12613d).remove(interfaceC4199hl);
        this.f12611b -= objRemove == null ? 0 : ((C4238iN) this.f12612c).mo6747f(objRemove);
        ((LinkedHashMap) this.f12613d).put(interfaceC4199hl, c1383Vz);
        this.f12611b += ((C4238iN) this.f12612c).mo6747f(c1383Vz);
    }

    /* renamed from: Y */
    public void m8486Y(Object obj, Object obj2) {
        int i = (this.f12611b + 1) * 2;
        Object[] objArr = (Object[]) this.f12612c;
        if (i > objArr.length) {
            this.f12612c = Arrays.copyOf(objArr, I70.m3754f(objArr.length, i));
        }
        AbstractC9246eT1.m17996a(obj, obj2);
        Object[] objArr2 = (Object[]) this.f12612c;
        int i2 = this.f12611b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f12611b = i2 + 1;
    }

    /* renamed from: Z */
    public synchronized Object m8487Z(Object obj) {
        Object objRemove;
        objRemove = ((LinkedHashMap) this.f12613d).remove(obj);
        this.f12611b -= objRemove == null ? 0 : ((C4238iN) this.f12612c).mo6747f(objRemove);
        return objRemove;
    }

    @Override // p000.InterfaceC6949uR
    /* renamed from: a */
    public int mo909a() {
        int i;
        synchronized (this.f12612c) {
            i = this.f12611b;
        }
        return i;
    }

    /* renamed from: a0 */
    public synchronized ArrayList m8488a0(C0912OU c0912ou) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.f12613d).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            c0912ou.getClass();
            O90.m5968f((InterfaceC4199hl) key, "it");
            arrayList.add(entry.getValue());
            int i = this.f12611b;
            Object value = entry.getValue();
            this.f12611b = i - (value == null ? 0 : ((C4238iN) this.f12612c).mo6747f(value));
            it.remove();
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: b */
    public Map mo3411b(byte[] bArr) {
        return ((MediaDrm) this.f12613d).queryKeyStatus(bArr);
    }

    /* renamed from: b0 */
    public void m8489b0(int i) {
        if (i == 0 && ((C1179Sk) this.f12612c) == null) {
            return;
        }
        C1179Sk c1179SkM8469G = m8469G();
        c1179SkM8469G.f10951u = i;
        c1179SkM8469G.invalidateSelf();
    }

    /* renamed from: c */
    public void m8490c() {
        C6649px c6649px;
        ImageView imageView = (ImageView) this.f12612c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC6737rL.m24315a(drawable);
        }
        if (drawable == null || (c6649px = (C6649px) this.f12613d) == null) {
            return;
        }
        C0574J6.m4157e(drawable, c6649px, imageView.getDrawableState());
    }

    /* renamed from: c0 */
    public void m8491c0(int i) {
        synchronized (this.f12612c) {
            this.f12611b = i;
        }
    }

    @Override // p000.InterfaceC9129dZ0
    /* renamed from: d */
    public void mo8492d() {
        Iterator it = ((List) this.f12612c).iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo6423c(this.f12611b, new C6702qn());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ac  */
    @Override // p000.InterfaceC6839sh
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C6759rh mo1063d0(p000.C7000vF r22, long r23) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1356VY.mo1063d0(vF, long):rh");
    }

    @Override // p000.InterfaceC6949uR
    /* renamed from: e */
    public Range mo915e() {
        return (Range) ((C0428Gn) this.f12613d).m3155a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    /* renamed from: e0 */
    public void m8493e0(String str) {
        int i = this.f12611b;
        if ("hidden".equals(str)) {
            this.f12611b = 2;
        } else if ("scroll".equals(str)) {
            this.f12611b = 3;
        } else {
            this.f12611b = 1;
        }
        if (i != this.f12611b) {
            ((View) this.f12613d).invalidate();
        }
    }

    @Override // p000.InterfaceC9129dZ0
    /* renamed from: f */
    public void mo8494f(InterfaceC7034vn interfaceC7034vn) {
        this.f12613d = interfaceC7034vn;
    }

    /* renamed from: f0 */
    public boolean m8495f0() {
        return AbstractC7485Dh1.f2166a < 21 && AbstractC0865Nk.f7980d.equals((UUID) this.f12612c) && "L3".equals(((MediaDrm) this.f12613d).getPropertyString("securityLevel"));
    }

    @Override // p000.InterfaceC9129dZ0
    /* renamed from: g */
    public void mo8496g() {
        InterfaceC7034vn c7356Av0 = (InterfaceC7034vn) this.f12613d;
        if (c7356Av0 == null) {
            c7356Av0 = new C7356Av0(9);
        }
        Iterator it = ((List) this.f12612c).iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo5817b(this.f12611b, c7356Av0);
        }
    }

    /* renamed from: g0 */
    public List m8497g0(CharSequence charSequence) {
        charSequence.getClass();
        C10339n11 c10339n11 = (C10339n11) this.f12613d;
        c10339n11.getClass();
        C11624x31 c11624x31 = new C11624x31(c10339n11, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c11624x31.hasNext()) {
            arrayList.add((String) c11624x31.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: h */
    public C0405GQ mo3412h() {
        MediaDrm.ProvisionRequest provisionRequest = ((MediaDrm) this.f12613d).getProvisionRequest();
        return new C0405GQ(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    /* renamed from: h0 */
    public void m8498h0(C11081sp0 c11081sp0) {
        C7604Fp0 c7604Fp0 = (C7604Fp0) this.f12612c;
        c7604Fp0.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f12613d).iterator();
        while (it.hasNext()) {
            C7812Jp0 c7812Jp0 = (C7812Jp0) it.next();
            AbstractC7485Dh1.m1806U(c7812Jp0.f5713a, new RunnableC6757rf(this, c7812Jp0.f5714b, c7604Fp0, c11081sp0, 12));
        }
    }

    @Override // p000.InterfaceC9129dZ0
    /* renamed from: i */
    public void mo8499i() {
        Iterator it = ((List) this.f12612c).iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo9611e(this.f12611b);
        }
    }

    /* renamed from: i0 */
    public void m8500i0(String str, Feature feature) {
        int i = this.f12611b + 1;
        Object[] objArr = (Object[]) this.f12612c;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.f12612c = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.f12612c;
        int i4 = this.f12611b;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = feature;
        this.f12611b = i4 + 1;
    }

    /* renamed from: j */
    public C1173Se m8501j() {
        String str = ((Long) this.f12613d) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new C1173Se(this.f12611b, (String) this.f12612c, ((Long) this.f12613d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* renamed from: j0 */
    public byte[] m8502j0(int i) throws IOException {
        ((C11979zs0) this.f12613d).f47063i = Boolean.valueOf(1 == (i ^ 1));
        C11979zs0 c11979zs0 = (C11979zs0) this.f12613d;
        c11979zs0.f47061g = Boolean.FALSE;
        E22 e22 = new E22(c11979zs0);
        U41 u41 = (U41) this.f12612c;
        u41.f11644a = e22;
        try {
            C11370v32.m25314B();
            C7356Av0 c7356Av0 = C7356Av0.f468h;
            if (i != 0) {
                C10721q02 c10721q02 = new C10721q02(u41);
                C10910rT1 c10910rT1 = new C10910rT1(2);
                c7356Av0.m406x(c10910rT1);
                return new C7397Bp1(new HashMap((HashMap) c10910rT1.f41678b), new HashMap((HashMap) c10910rT1.f41679c), (C8455Vy1) c10910rT1.f41680d).m890g(c10721q02);
            }
            C10721q02 c10721q022 = new C10721q02(u41);
            C10415nc0 c10415nc0 = new C10415nc0();
            c7356Av0.m406x(c10415nc0);
            c10415nc0.f38409d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C7786Jc0 c7786Jc0 = new C7786Jc0(stringWriter, c10415nc0.f38406a, c10415nc0.f38407b, c10415nc0.f38408c, c10415nc0.f38409d);
                c7786Jc0.m4365g(c10721q022);
                c7786Jc0.m4367i();
                c7786Jc0.f5639b.flush();
            } catch (IOException unused) {
            }
            return stringWriter.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: k */
    public void mo3413k(final C8170Qm0 c8170Qm0) {
        ((MediaDrm) this.f12613d).setOnEventListener(new MediaDrm.OnEventListener() { // from class: TY
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C1356VY c1356vy = this.f11416a;
                C8170Qm0 c8170Qm02 = c8170Qm0;
                c1356vy.getClass();
                HandlerC0319F3 handlerC0319F3 = ((C6477nF) c8170Qm02.f9780b).f38213v;
                handlerC0319F3.getClass();
                handlerC0319F3.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: l */
    public InterfaceC6410mB mo3414l(byte[] bArr) {
        m8495f0();
        int i = AbstractC7485Dh1.f2166a;
        UUID uuid = (UUID) this.f12612c;
        if (i < 27 && AbstractC0865Nk.f7979c.equals(uuid)) {
            uuid = AbstractC0865Nk.f7978b;
        }
        return new C1167SY(uuid, bArr);
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: m */
    public byte[] mo3415m() {
        return ((MediaDrm) this.f12613d).openSession();
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: n */
    public void mo3416n(byte[] bArr, byte[] bArr2) {
        ((MediaDrm) this.f12613d).restoreKeys(bArr, bArr2);
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: o */
    public void mo3417o(byte[] bArr) {
        ((MediaDrm) this.f12613d).closeSession(bArr);
    }

    @Override // p000.InterfaceC9129dZ0
    public void onCaptureProcessProgressed(int i) {
        Iterator it = ((List) this.f12612c).iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo9610d(this.f12611b, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0188  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C10007kQ0 m8503p() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1356VY.m8503p():kQ0");
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: q */
    public byte[] mo3418q(byte[] bArr, byte[] bArr2) throws JSONException {
        if (AbstractC0865Nk.f7979c.equals((UUID) this.f12612c) && AbstractC7485Dh1.f2166a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(AbstractC7485Dh1.m1830o(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(StringUtils.COMMA);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(AbstractC7227yr.f46511c);
            } catch (JSONException e) {
                AbstractC10872rA1.m24172e("Failed to adjust response data: ".concat(AbstractC7485Dh1.m1830o(bArr2)), e);
            }
        }
        return ((MediaDrm) this.f12613d).provideKeyResponse(bArr, bArr2);
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: r */
    public void mo3419r(byte[] bArr) throws DeniedByServerException {
        ((MediaDrm) this.f12613d).provideProvisionResponse(bArr);
    }

    @Override // p000.InterfaceC0468HQ
    public synchronized void release() {
        int i = this.f12611b - 1;
        this.f12611b = i;
        if (i == 0) {
            ((MediaDrm) this.f12613d).release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0210  */
    @Override // p000.InterfaceC0468HQ
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C0279EQ mo3420s(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1356VY.mo3420s(byte[], java.util.List, int, java.util.HashMap):EQ");
    }

    public String toString() {
        switch (this.f12610a) {
            case 19:
                StringBuilder sb = new StringBuilder();
                if (((EnumC9219eG0) this.f12612c) == EnumC9219eG0.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f12611b);
                sb.append(' ');
                sb.append((String) this.f12613d);
                String string = sb.toString();
                O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: u */
    public int mo3421u() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC9875jO0
    /* renamed from: v */
    public boolean mo1475v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        int i;
        Context context = (Context) this.f12612c;
        String str = context.getApplicationInfo().sourceDir;
        boolean zExists = new File(str).exists();
        C0986Pf c0986Pf = (C0986Pf) this.f12613d;
        if (!zExists || !c0986Pf.m6404r(str)) {
            int i2 = this.f12611b;
            synchronized (c0986Pf) {
                i = c0986Pf.f9216b;
            }
            return i2 != i;
        }
        for (int i3 = 0; i3 < h21Arr.length; i3++) {
            Object[] objArr = h21Arr[i3];
            if (objArr instanceof InterfaceC9747iO0) {
                h21Arr[i3] = ((InterfaceC9747iO0) objArr).mo11084a(context);
            }
        }
        return true;
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: w */
    public void mo3422w(byte[] bArr, NB0 nb0) {
        if (AbstractC7485Dh1.f2166a >= 31) {
            try {
                AbstractC1293UY.m8081b((MediaDrm) this.f12613d, bArr, nb0);
            } catch (UnsupportedOperationException unused) {
                AbstractC10872rA1.m24175h("setLogSessionId failed.");
            }
        }
    }

    /* renamed from: x */
    public void m8504x(int i, C6686qX c6686qX, int i2, Object obj, long j) {
        m8505z(new C11081sp0(1, i, c6686qX, i2, obj, AbstractC7485Dh1.m1819d0(j), -9223372036854775807L));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x004f  */
    @Override // p000.InterfaceC0468HQ
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo3423y(java.lang.String r7, byte[] r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = p000.AbstractC7485Dh1.f2166a
            r1 = 31
            r2 = 0
            java.lang.Object r3 = r6.f12612c
            java.util.UUID r3 = (java.util.UUID) r3
            r4 = 1
            if (r0 < r1) goto L4f
            java.util.UUID r0 = p000.AbstractC0865Nk.f7980d
            boolean r0 = r3.equals(r0)
            java.lang.Object r1 = r6.f12613d
            android.media.MediaDrm r1 = (android.media.MediaDrm) r1
            if (r0 == 0) goto L42
            java.lang.String r0 = "version"
            java.lang.String r0 = r1.getPropertyString(r0)
            java.lang.String r5 = "v5."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L40
            java.lang.String r5 = "14."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L40
            java.lang.String r5 = "15."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L40
            java.lang.String r5 = "16.0"
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L40
            r0 = r4
            goto L48
        L40:
            r0 = r2
            goto L48
        L42:
            java.util.UUID r0 = p000.AbstractC0865Nk.f7979c
            boolean r0 = r3.equals(r0)
        L48:
            if (r0 == 0) goto L4f
            boolean r7 = p000.AbstractC1293UY.m8080a(r1, r7)
            goto L6f
        L4f:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: java.lang.Throwable -> L62 android.media.MediaCryptoException -> L69
            r1.<init>(r3, r8)     // Catch: java.lang.Throwable -> L62 android.media.MediaCryptoException -> L69
            boolean r7 = r1.requiresSecureDecoderComponent(r7)     // Catch: java.lang.Throwable -> L5d android.media.MediaCryptoException -> L60
            r1.release()
            goto L6f
        L5d:
            r7 = move-exception
            r0 = r1
            goto L63
        L60:
            r0 = r1
            goto L69
        L62:
            r7 = move-exception
        L63:
            if (r0 == 0) goto L68
            r0.release()
        L68:
            throw r7
        L69:
            if (r0 == 0) goto L6e
            r0.release()
        L6e:
            r7 = r4
        L6f:
            if (r7 == 0) goto L78
            boolean r7 = r6.m8495f0()
            if (r7 != 0) goto L78
            r2 = r4
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1356VY.mo3423y(java.lang.String, byte[]):boolean");
    }

    /* renamed from: z */
    public void m8505z(C11081sp0 c11081sp0) {
        Iterator it = ((CopyOnWriteArrayList) this.f12613d).iterator();
        while (it.hasNext()) {
            C7812Jp0 c7812Jp0 = (C7812Jp0) it.next();
            AbstractC7485Dh1.m1806U(c7812Jp0.f5713a, new RunnableC8339Ts1(this, c7812Jp0.f5714b, c11081sp0, 29));
        }
    }

    public /* synthetic */ C1356VY(int i, byte b) {
        this.f12610a = i;
    }

    public /* synthetic */ C1356VY(Object obj, int i, Serializable serializable, int i2) {
        this.f12610a = i2;
        this.f12612c = obj;
        this.f12611b = i;
        this.f12613d = serializable;
    }

    public C1356VY(U41 u41, int i) {
        this.f12610a = 23;
        this.f12613d = new C11979zs0();
        this.f12612c = u41;
        C11370v32.m25314B();
        this.f12611b = i;
    }

    public C1356VY(C0134C7 c0134c7) {
        this.f12610a = 16;
        O90.m5968f(c0134c7, "appContext");
        this.f12612c = new WeakReference(c0134c7);
        this.f12611b = 1;
        this.f12613d = new LinkedHashMap();
    }

    public C1356VY(Context context, C0986Pf c0986Pf) {
        int i;
        this.f12610a = 6;
        this.f12612c = context;
        this.f12613d = c0986Pf;
        synchronized (c0986Pf) {
            i = c0986Pf.f9216b;
        }
        this.f12611b = i;
    }

    public C1356VY(C4238iN c4238iN) {
        this.f12610a = 4;
        this.f12613d = new LinkedHashMap();
        this.f12611b = 0;
        this.f12612c = c4238iN;
    }

    public C1356VY(View view) {
        this.f12610a = 15;
        this.f12611b = 1;
        this.f12613d = view;
    }

    public C1356VY(C0428Gn c0428Gn) {
        this.f12610a = 8;
        this.f12612c = new Object();
        this.f12613d = c0428Gn;
        this.f12611b = 0;
    }

    public C1356VY(ImageView imageView) {
        this.f12610a = 1;
        this.f12611b = 0;
        this.f12612c = imageView;
    }

    public C1356VY(C7754Im0 c7754Im0) {
        this.f12610a = 17;
        this.f12612c = new SparseArray();
        this.f12613d = c7754Im0;
        this.f12611b = -1;
    }

    public C1356VY(Shader shader, ColorStateList colorStateList, int i) {
        this.f12610a = 3;
        this.f12612c = shader;
        this.f12613d = colorStateList;
        this.f12611b = i;
    }

    public C1356VY(C1290UV c1290uv, int i) {
        this.f12610a = 9;
        this.f12612c = c1290uv;
        this.f12611b = i;
        this.f12613d = new C1164SV();
    }

    public C1356VY(int i, C7783Ja1 c7783Ja1) {
        this.f12610a = 20;
        this.f12611b = i;
        this.f12612c = c7783Ja1;
        this.f12613d = new C9591hA0();
    }

    public C1356VY(InterfaceC1397WC interfaceC1397WC) {
        this.f12610a = 5;
        this.f12613d = C4135gk.f27964j;
        this.f12612c = interfaceC1397WC;
        this.f12611b = 1;
    }

    public C1356VY(C10339n11 c10339n11) {
        this.f12610a = 18;
        this.f12613d = c10339n11;
        this.f12612c = C6912tr.f43365a;
        this.f12611b = Integer.MAX_VALUE;
    }

    public C1356VY(UUID uuid) {
        this.f12610a = 0;
        uuid.getClass();
        UUID uuid2 = AbstractC0865Nk.f7978b;
        YN1.m9277b("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f12612c = uuid;
        MediaDrm mediaDrm = new MediaDrm((AbstractC7485Dh1.f2166a >= 27 || !AbstractC0865Nk.f7979c.equals(uuid)) ? uuid : uuid2);
        this.f12613d = mediaDrm;
        this.f12611b = 1;
        if (AbstractC0865Nk.f7980d.equals(uuid) && "ASUS_Z00AD".equals(AbstractC7485Dh1.f2169d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public C1356VY(CopyOnWriteArrayList copyOnWriteArrayList, int i, C7604Fp0 c7604Fp0) {
        this.f12610a = 12;
        this.f12613d = copyOnWriteArrayList;
        this.f12611b = i;
        this.f12612c = c7604Fp0;
    }

    public C1356VY(int i, List list) {
        this.f12610a = 13;
        this.f12613d = null;
        this.f12611b = i;
        this.f12612c = list;
    }

    public C1356VY(int i) {
        this.f12610a = 10;
        this.f12612c = new Object[i * 2];
        this.f12611b = 0;
    }

    public C1356VY(C0214DO c0214do) {
        this.f12610a = 7;
        this.f12613d = AbstractC8137Pv1.m6489b(150, new C7978Mu0(14, this));
        this.f12612c = c0214do;
    }
}
