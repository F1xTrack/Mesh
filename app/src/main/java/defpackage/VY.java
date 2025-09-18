package defpackage;

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

/* loaded from: classes.dex */
public final class VY implements HQ, InterfaceC5303jO0, InterfaceC7411uR, InterfaceC7077sh, InterfaceC3415dZ0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public VY() {
        this.a = 21;
        this.c = new Object[8];
        this.b = 0;
    }

    private final /* synthetic */ void V() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x01d1, code lost:
    
        r0 = new defpackage.C4332iN(r14, r15);
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
    
        r0 = new defpackage.C4332iN(r6, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01e4, code lost:
    
        r0 = new defpackage.C4332iN(r6, r7);
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
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, (int[]) r0.b, (float[]) r0.c, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0217, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, (int[]) r0.b, (float[]) r0.c);
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
    
        r3 = new android.graphics.RadialGradient(r9, r15, r24, (int[]) r0.b, (float[]) r0.c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0264, code lost:
    
        return new defpackage.VY(r3, (android.content.res.ColorStateList) null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x026c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.VY t(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VY.t(android.content.res.Resources, int, android.content.res.Resources$Theme):VY");
    }

    public long A(C7566vF c7566vF) throws EOFException, InterruptedIOException {
        long j;
        SV sv;
        UV uv;
        boolean zA;
        int iG;
        while (true) {
            long j2 = c7566vF.j();
            j = c7566vF.c;
            long j3 = j - 6;
            sv = (SV) this.d;
            uv = (UV) this.c;
            if (j2 >= j3) {
                break;
            }
            long j4 = c7566vF.j();
            byte[] bArr = new byte[2];
            c7566vF.f(bArr, 0, 2, false);
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i2 = this.b;
            if (i != i2) {
                c7566vF.f = 0;
                c7566vF.a((int) (j4 - c7566vF.d), false);
                zA = false;
            } else {
                C4103hA0 c4103hA0 = new C4103hA0(16);
                System.arraycopy(bArr, 0, c4103hA0.a, 0, 2);
                byte[] bArr2 = c4103hA0.a;
                int i3 = 0;
                for (int i4 = 2; i3 < 14 && (iG = c7566vF.g(bArr2, i4 + i3, 14 - i3)) != -1; i4 = 2) {
                    i3 += iG;
                }
                c4103hA0.F(i3);
                c7566vF.f = 0;
                c7566vF.a((int) (j4 - c7566vF.d), false);
                zA = AbstractC3502e12.a(c4103hA0, uv, i2, sv);
            }
            if (zA) {
                break;
            }
            c7566vF.a(1, false);
        }
        if (c7566vF.j() < j - 6) {
            return sv.a;
        }
        c7566vF.a((int) (j - c7566vF.j()), false);
        return uv.j;
    }

    public Object B(int i) {
        SparseArray sparseArray;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            sparseArray = (SparseArray) this.c;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    @Override // defpackage.InterfaceC7077sh
    public void B0() {
        switch (this.a) {
            case 9:
                break;
            default:
                byte[] bArr = AbstractC0277Dh1.f;
                C4103hA0 c4103hA0 = (C4103hA0) this.d;
                c4103hA0.getClass();
                c4103hA0.E(bArr.length, bArr);
                break;
        }
    }

    public synchronized Object C(InterfaceC4213hl interfaceC4213hl) {
        return ((LinkedHashMap) this.d).get(interfaceC4213hl);
    }

    public synchronized int D() {
        return ((LinkedHashMap) this.d).size();
    }

    public synchronized Object E() {
        return ((LinkedHashMap) this.d).isEmpty() ? null : ((LinkedHashMap) this.d).keySet().iterator().next();
    }

    public synchronized ArrayList F(EE ee) {
        ArrayList arrayList;
        arrayList = new ArrayList(((LinkedHashMap) this.d).entrySet().size());
        for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
            Object key = entry.getKey();
            ee.getClass();
            InterfaceC4213hl interfaceC4213hl = (InterfaceC4213hl) key;
            Uri uri = (Uri) ee.b;
            O90.f(uri, "$uri");
            O90.f(interfaceC4213hl, "key");
            if (interfaceC4213hl.a(uri)) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public C1453Sk G() {
        if (((C1453Sk) this.c) == null) {
            this.c = new C1453Sk(((View) this.d).getContext());
            Drawable background = ((View) this.d).getBackground();
            View view = (View) this.d;
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            view.setBackground(null);
            if (background == null) {
                ((View) this.d).setBackground((C1453Sk) this.c);
            } else {
                ((View) this.d).setBackground(new LayerDrawable(new Drawable[]{(C1453Sk) this.c, background}));
            }
        }
        return (C1453Sk) this.c;
    }

    public synchronized int H() {
        return this.b;
    }

    public boolean I() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void J(C4020gk0 c4020gk0, int i, int i2, C6666qX c6666qX, int i3, Object obj, long j, long j2) {
        K(c4020gk0, new C7102sp0(i, i2, c6666qX, i3, obj, AbstractC0277Dh1.d0(j), AbstractC0277Dh1.d0(j2)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Kp0, java.lang.Object] */
    public void K(C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            C0768Jp0 c0768Jp0 = (C0768Jp0) it.next();
            AbstractC0277Dh1.U(c0768Jp0.a, new RunnableC0612Hp0(this, c0768Jp0.b, c4020gk0, c7102sp0, 2));
        }
    }

    public void L(C4020gk0 c4020gk0, int i) {
        M(c4020gk0, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void M(C4020gk0 c4020gk0, int i, int i2, C6666qX c6666qX, int i3, Object obj, long j, long j2) {
        N(c4020gk0, new C7102sp0(i, i2, c6666qX, i3, obj, AbstractC0277Dh1.d0(j), AbstractC0277Dh1.d0(j2)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Kp0, java.lang.Object] */
    public void N(C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            C0768Jp0 c0768Jp0 = (C0768Jp0) it.next();
            AbstractC0277Dh1.U(c0768Jp0.a, new RunnableC0612Hp0(this, c0768Jp0.b, c4020gk0, c7102sp0, 1));
        }
    }

    public void O(C4020gk0 c4020gk0, int i, int i2, C6666qX c6666qX, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        Q(c4020gk0, new C7102sp0(i, i2, c6666qX, i3, obj, AbstractC0277Dh1.d0(j), AbstractC0277Dh1.d0(j2)), iOException, z);
    }

    public void P(C4020gk0 c4020gk0, int i, IOException iOException, boolean z) {
        O(c4020gk0, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void Q(C4020gk0 c4020gk0, C7102sp0 c7102sp0, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            C0768Jp0 c0768Jp0 = (C0768Jp0) it.next();
            AbstractC0277Dh1.U(c0768Jp0.a, new RunnableC0690Ip0(this, c0768Jp0.b, c4020gk0, c7102sp0, iOException, z, 0));
        }
    }

    public void R(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC2104aH0.f;
        C1857Xo1 c1857Xo1J = C1857Xo1.J(context, attributeSet, iArr, i);
        AbstractC6897rk1.m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c1857Xo1J.c, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c1857Xo1J.c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC8352zN1.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC6820rL.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                A70.c(imageView, c1857Xo1J.B(2));
            }
            if (typedArray.hasValue(3)) {
                A70.d(imageView, AbstractC6820rL.c(typedArray.getInt(3, -1), null));
            }
            c1857Xo1J.M();
        } catch (Throwable th) {
            c1857Xo1J.M();
            throw th;
        }
    }

    public void S(C4020gk0 c4020gk0, int i, int i2, C6666qX c6666qX, int i3, Object obj, long j, long j2) {
        T(c4020gk0, new C7102sp0(i, i2, c6666qX, i3, obj, AbstractC0277Dh1.d0(j), AbstractC0277Dh1.d0(j2)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Kp0, java.lang.Object] */
    public void T(C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            C0768Jp0 c0768Jp0 = (C0768Jp0) it.next();
            AbstractC0277Dh1.U(c0768Jp0.a, new RunnableC0612Hp0(this, c0768Jp0.b, c4020gk0, c7102sp0, 0));
        }
    }

    public void U(Canvas canvas) {
        Path path;
        if (this.b == 1) {
            return;
        }
        Rect rect = new Rect();
        ((View) this.d).getDrawingRect(rect);
        C1453Sk c1453Sk = (C1453Sk) this.c;
        if (c1453Sk == null) {
            canvas.clipRect(rect);
            return;
        }
        if (c1453Sk.f()) {
            c1453Sk.n();
            Path path2 = c1453Sk.d;
            path2.getClass();
            path = new Path(path2);
        } else {
            path = null;
        }
        if (path != null) {
            path.offset(rect.left, rect.top);
            canvas.clipPath(path);
        } else {
            RectF rectFD = c1453Sk.d();
            RectF rectF = new RectF(rectFD.left, rectFD.top, c1453Sk.getBounds().width() - rectFD.right, c1453Sk.getBounds().height() - rectFD.bottom);
            rectF.offset(rect.left, rect.top);
            canvas.clipRect(rectF);
        }
    }

    public int W() {
        int i;
        synchronized (this) {
            i = this.b;
            this.b = i + 1;
        }
        return i;
    }

    public synchronized void X(InterfaceC4213hl interfaceC4213hl, C1732Vz c1732Vz) {
        Object objRemove = ((LinkedHashMap) this.d).remove(interfaceC4213hl);
        this.b -= objRemove == null ? 0 : ((C4332iN) this.c).f(objRemove);
        ((LinkedHashMap) this.d).put(interfaceC4213hl, c1732Vz);
        this.b += ((C4332iN) this.c).f(c1732Vz);
    }

    public void Y(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, I70.f(objArr.length, i));
        }
        AbstractC3588eT1.a(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public synchronized Object Z(Object obj) {
        Object objRemove;
        objRemove = ((LinkedHashMap) this.d).remove(obj);
        this.b -= objRemove == null ? 0 : ((C4332iN) this.c).f(objRemove);
        return objRemove;
    }

    @Override // defpackage.InterfaceC7411uR
    public int a() {
        int i;
        synchronized (this.c) {
            i = this.b;
        }
        return i;
    }

    public synchronized ArrayList a0(OU ou) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.d).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ou.getClass();
            O90.f((InterfaceC4213hl) key, "it");
            arrayList.add(entry.getValue());
            int i = this.b;
            Object value = entry.getValue();
            this.b = i - (value == null ? 0 : ((C4332iN) this.c).f(value));
            it.remove();
        }
        return arrayList;
    }

    @Override // defpackage.HQ
    public Map b(byte[] bArr) {
        return ((MediaDrm) this.d).queryKeyStatus(bArr);
    }

    public void b0(int i) {
        if (i == 0 && ((C1453Sk) this.c) == null) {
            return;
        }
        C1453Sk c1453SkG = G();
        c1453SkG.u = i;
        c1453SkG.invalidateSelf();
    }

    public void c() {
        C6553px c6553px;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC6820rL.a(drawable);
        }
        if (drawable == null || (c6553px = (C6553px) this.d) == null) {
            return;
        }
        J6.e(drawable, c6553px, imageView.getDrawableState());
    }

    public void c0(int i) {
        synchronized (this.c) {
            this.b = i;
        }
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void d() {
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).c(this.b, new C6714qn());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ac  */
    @Override // defpackage.InterfaceC7077sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C6886rh d0(defpackage.C7566vF r22, long r23) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VY.d0(vF, long):rh");
    }

    @Override // defpackage.InterfaceC7411uR
    public Range e() {
        return (Range) ((C0527Gn) this.d).a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    public void e0(String str) {
        int i = this.b;
        if ("hidden".equals(str)) {
            this.b = 2;
        } else if ("scroll".equals(str)) {
            this.b = 3;
        } else {
            this.b = 1;
        }
        if (i != this.b) {
            ((View) this.d).invalidate();
        }
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void f(InterfaceC7668vn interfaceC7668vn) {
        this.d = interfaceC7668vn;
    }

    public boolean f0() {
        return AbstractC0277Dh1.a < 21 && AbstractC1063Nk.d.equals((UUID) this.c) && "L3".equals(((MediaDrm) this.d).getPropertyString("securityLevel"));
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void g() {
        InterfaceC7668vn c0084Av0 = (InterfaceC7668vn) this.d;
        if (c0084Av0 == null) {
            c0084Av0 = new C0084Av0(9);
        }
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).b(this.b, c0084Av0);
        }
    }

    public List g0(CharSequence charSequence) {
        charSequence.getClass();
        C5996n11 c5996n11 = (C5996n11) this.d;
        c5996n11.getClass();
        C7912x31 c7912x31 = new C7912x31(c5996n11, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c7912x31.hasNext()) {
            arrayList.add((String) c7912x31.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.HQ
    public GQ h() {
        MediaDrm.ProvisionRequest provisionRequest = ((MediaDrm) this.d).getProvisionRequest();
        return new GQ(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    public void h0(C7102sp0 c7102sp0) {
        C0456Fp0 c0456Fp0 = (C0456Fp0) this.c;
        c0456Fp0.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            C0768Jp0 c0768Jp0 = (C0768Jp0) it.next();
            AbstractC0277Dh1.U(c0768Jp0.a, new RunnableC6880rf(this, c0768Jp0.b, c0456Fp0, c7102sp0, 12));
        }
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void i() {
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).e(this.b);
        }
    }

    public void i0(String str, Feature feature) {
        int i = this.b + 1;
        Object[] objArr = (Object[]) this.c;
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
            this.c = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.c;
        int i4 = this.b;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = feature;
        this.b = i4 + 1;
    }

    public C1435Se j() {
        String str = ((Long) this.d) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new C1435Se(this.b, (String) this.c, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public byte[] j0(int i) throws IOException {
        ((C8444zs0) this.d).i = Boolean.valueOf(1 == (i ^ 1));
        C8444zs0 c8444zs0 = (C8444zs0) this.d;
        c8444zs0.g = Boolean.FALSE;
        E22 e22 = new E22(c8444zs0);
        U41 u41 = (U41) this.c;
        u41.a = e22;
        try {
            C7532v32.B();
            C0084Av0 c0084Av0 = C0084Av0.h;
            if (i != 0) {
                C6566q02 c6566q02 = new C6566q02(u41);
                C6846rT1 c6846rT1 = new C6846rT1(2);
                c0084Av0.x(c6846rT1);
                return new C0145Bp1(new HashMap((HashMap) c6846rT1.b), new HashMap((HashMap) c6846rT1.c), (C1731Vy1) c6846rT1.d).g(c6566q02);
            }
            C6566q02 c6566q022 = new C6566q02(u41);
            C6109nc0 c6109nc0 = new C6109nc0();
            c0084Av0.x(c6109nc0);
            c6109nc0.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C0729Jc0 c0729Jc0 = new C0729Jc0(stringWriter, c6109nc0.a, c6109nc0.b, c6109nc0.c, c6109nc0.d);
                c0729Jc0.g(c6566q022);
                c0729Jc0.i();
                c0729Jc0.b.flush();
            } catch (IOException unused) {
            }
            return stringWriter.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // defpackage.HQ
    public void k(final C1304Qm0 c1304Qm0) {
        ((MediaDrm) this.d).setOnEventListener(new MediaDrm.OnEventListener() { // from class: TY
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                VY vy = this.a;
                C1304Qm0 c1304Qm02 = c1304Qm0;
                vy.getClass();
                F3 f3 = ((C6039nF) c1304Qm02.b).v;
                f3.getClass();
                f3.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.HQ
    public InterfaceC5836mB l(byte[] bArr) {
        f0();
        int i = AbstractC0277Dh1.a;
        UUID uuid = (UUID) this.c;
        if (i < 27 && AbstractC1063Nk.c.equals(uuid)) {
            uuid = AbstractC1063Nk.b;
        }
        return new SY(uuid, bArr);
    }

    @Override // defpackage.HQ
    public byte[] m() {
        return ((MediaDrm) this.d).openSession();
    }

    @Override // defpackage.HQ
    public void n(byte[] bArr, byte[] bArr2) {
        ((MediaDrm) this.d).restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.HQ
    public void o(byte[] bArr) {
        ((MediaDrm) this.d).closeSession(bArr);
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void onCaptureProcessProgressed(int i) {
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).d(this.b, i);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C5500kQ0 p() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VY.p():kQ0");
    }

    @Override // defpackage.HQ
    public byte[] q(byte[] bArr, byte[] bArr2) throws JSONException {
        if (AbstractC1063Nk.c.equals((UUID) this.c) && AbstractC0277Dh1.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(AbstractC0277Dh1.o(bArr2));
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
                bArr2 = sb.toString().getBytes(AbstractC8250yr.c);
            } catch (JSONException e) {
                AbstractC6789rA1.e("Failed to adjust response data: ".concat(AbstractC0277Dh1.o(bArr2)), e);
            }
        }
        return ((MediaDrm) this.d).provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.HQ
    public void r(byte[] bArr) throws DeniedByServerException {
        ((MediaDrm) this.d).provideProvisionResponse(bArr);
    }

    @Override // defpackage.HQ
    public synchronized void release() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            ((MediaDrm) this.d).release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0210  */
    @Override // defpackage.HQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.EQ s(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VY.s(byte[], java.util.List, int, java.util.HashMap):EQ");
    }

    public String toString() {
        switch (this.a) {
            case 19:
                StringBuilder sb = new StringBuilder();
                if (((EnumC3548eG0) this.c) == EnumC3548eG0.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                String string = sb.toString();
                O90.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.HQ
    public int u() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5303jO0
    public boolean v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        int i;
        Context context = (Context) this.c;
        String str = context.getApplicationInfo().sourceDir;
        boolean zExists = new File(str).exists();
        C1204Pf c1204Pf = (C1204Pf) this.d;
        if (!zExists || !c1204Pf.r(str)) {
            int i2 = this.b;
            synchronized (c1204Pf) {
                i = c1204Pf.b;
            }
            return i2 != i;
        }
        for (int i3 = 0; i3 < h21Arr.length; i3++) {
            Object[] objArr = h21Arr[i3];
            if (objArr instanceof InterfaceC4336iO0) {
                h21Arr[i3] = ((InterfaceC4336iO0) objArr).a(context);
            }
        }
        return true;
    }

    @Override // defpackage.HQ
    public void w(byte[] bArr, NB0 nb0) {
        if (AbstractC0277Dh1.a >= 31) {
            try {
                UY.b((MediaDrm) this.d, bArr, nb0);
            } catch (UnsupportedOperationException unused) {
                AbstractC6789rA1.h("setLogSessionId failed.");
            }
        }
    }

    public void x(int i, C6666qX c6666qX, int i2, Object obj, long j) {
        z(new C7102sp0(1, i, c6666qX, i2, obj, AbstractC0277Dh1.d0(j), -9223372036854775807L));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x004f  */
    @Override // defpackage.HQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean y(java.lang.String r7, byte[] r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = defpackage.AbstractC0277Dh1.a
            r1 = 31
            r2 = 0
            java.lang.Object r3 = r6.c
            java.util.UUID r3 = (java.util.UUID) r3
            r4 = 1
            if (r0 < r1) goto L4f
            java.util.UUID r0 = defpackage.AbstractC1063Nk.d
            boolean r0 = r3.equals(r0)
            java.lang.Object r1 = r6.d
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
            java.util.UUID r0 = defpackage.AbstractC1063Nk.c
            boolean r0 = r3.equals(r0)
        L48:
            if (r0 == 0) goto L4f
            boolean r7 = defpackage.UY.a(r1, r7)
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
            boolean r7 = r6.f0()
            if (r7 != 0) goto L78
            r2 = r4
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VY.y(java.lang.String, byte[]):boolean");
    }

    public void z(C7102sp0 c7102sp0) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            C0768Jp0 c0768Jp0 = (C0768Jp0) it.next();
            AbstractC0277Dh1.U(c0768Jp0.a, new RunnableC1557Ts1(this, c0768Jp0.b, c7102sp0, 29));
        }
    }

    public /* synthetic */ VY(int i, byte b) {
        this.a = i;
    }

    public /* synthetic */ VY(Object obj, int i, Serializable serializable, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = serializable;
    }

    public VY(U41 u41, int i) {
        this.a = 23;
        this.d = new C8444zs0();
        this.c = u41;
        C7532v32.B();
        this.b = i;
    }

    public VY(C7 c7) {
        this.a = 16;
        O90.f(c7, "appContext");
        this.c = new WeakReference(c7);
        this.b = 1;
        this.d = new LinkedHashMap();
    }

    public VY(Context context, C1204Pf c1204Pf) {
        int i;
        this.a = 6;
        this.c = context;
        this.d = c1204Pf;
        synchronized (c1204Pf) {
            i = c1204Pf.b;
        }
        this.b = i;
    }

    public VY(C4332iN c4332iN) {
        this.a = 4;
        this.d = new LinkedHashMap();
        this.b = 0;
        this.c = c4332iN;
    }

    public VY(View view) {
        this.a = 15;
        this.b = 1;
        this.d = view;
    }

    public VY(C0527Gn c0527Gn) {
        this.a = 8;
        this.c = new Object();
        this.d = c0527Gn;
        this.b = 0;
    }

    public VY(ImageView imageView) {
        this.a = 1;
        this.b = 0;
        this.c = imageView;
    }

    public VY(C0681Im0 c0681Im0) {
        this.a = 17;
        this.c = new SparseArray();
        this.d = c0681Im0;
        this.b = -1;
    }

    public VY(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 3;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public VY(UV uv, int i) {
        this.a = 9;
        this.c = uv;
        this.b = i;
        this.d = new SV();
    }

    public VY(int i, C0724Ja1 c0724Ja1) {
        this.a = 20;
        this.b = i;
        this.c = c0724Ja1;
        this.d = new C4103hA0();
    }

    public VY(WC wc) {
        this.a = 5;
        this.d = C4019gk.j;
        this.c = wc;
        this.b = 1;
    }

    public VY(C5996n11 c5996n11) {
        this.a = 18;
        this.d = c5996n11;
        this.c = C7298tr.a;
        this.b = Integer.MAX_VALUE;
    }

    public VY(UUID uuid) {
        this.a = 0;
        uuid.getClass();
        UUID uuid2 = AbstractC1063Nk.b;
        YN1.b("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.c = uuid;
        MediaDrm mediaDrm = new MediaDrm((AbstractC0277Dh1.a >= 27 || !AbstractC1063Nk.c.equals(uuid)) ? uuid : uuid2);
        this.d = mediaDrm;
        this.b = 1;
        if (AbstractC1063Nk.d.equals(uuid) && "ASUS_Z00AD".equals(AbstractC0277Dh1.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public VY(CopyOnWriteArrayList copyOnWriteArrayList, int i, C0456Fp0 c0456Fp0) {
        this.a = 12;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = c0456Fp0;
    }

    public VY(int i, List list) {
        this.a = 13;
        this.d = null;
        this.b = i;
        this.c = list;
    }

    public VY(int i) {
        this.a = 10;
        this.c = new Object[i * 2];
        this.b = 0;
    }

    public VY(DO r3) {
        this.a = 7;
        this.d = AbstractC1254Pv1.b(150, new C1016Mu0(14, this));
        this.c = r3;
    }
}
