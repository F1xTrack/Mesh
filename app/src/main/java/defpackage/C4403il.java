package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.inject.Provider;

/* renamed from: il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4403il implements InterfaceC0940Lv, FunctionWithThrowable, InterfaceC6290oZ, InterfaceC1459Sm, InterfaceC2473cD0, InterfaceC2214as, InterfaceC1018Mv, VA, InterfaceC8207yc1, Provider, InterfaceC1373Rj0, InterfaceC1451Sj0 {
    public static final C4403il b = new C4403il(0);
    public static final C4403il c = new C4403il(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C4403il(int i) {
        this.a = i;
    }

    public static Bitmap e(int i, byte[] bArr) throws A60 {
        try {
            return UO1.b(i, bArr);
        } catch (C5643lA0 e) {
            throw new A60("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new A60(e2);
        }
    }

    @Override // defpackage.InterfaceC2214as
    public void a(Cipher cipher, Key key, ByteArrayOutputStream byteArrayOutputStream) throws InvalidKeyException, IOException {
        switch (this.a) {
            case 10:
                cipher.init(1, key);
                break;
            default:
                cipher.init(1, key);
                byte[] iv = cipher.getIV();
                byteArrayOutputStream.write(iv, 0, iv.length);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c9  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4403il.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1459Sm
    public boolean b(TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 6:
                return C2005Zm.i(totalCaptureResult, false);
            case 7:
                return C2005Zm.i(totalCaptureResult, false);
            default:
                return C2005Zm.i(totalCaptureResult, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    @Override // defpackage.VA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(android.util.JsonReader r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4403il.c(android.util.JsonReader):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1018Mv
    public List d(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.InterfaceC1451Sj0
    public void f(Object obj, VV vv) {
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        return AbtRegistrar.lambda$getComponents$0(c1241Pr0);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DebuggingOverlayManager();
    }

    @Override // defpackage.InterfaceC2473cD0
    public void h(Z61 z61) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(z61.b.getWidth(), z61.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        z61.b(surface, QR1.a(), new C1699Vo(surface, 0, surfaceTexture));
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        switch (this.a) {
            case 25:
                z3.getClass();
                break;
            case 26:
                z3.getClass();
                break;
            case 27:
                z3.getClass();
                break;
            default:
                z3.getClass();
                break;
        }
    }

    public /* synthetic */ C4403il(Y3 y3, Exception exc, int i) {
        this.a = i;
    }

    public /* synthetic */ C4403il(Y3 y3, boolean z, int i) {
        this.a = 26;
    }
}
