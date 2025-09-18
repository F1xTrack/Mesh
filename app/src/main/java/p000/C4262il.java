package p000;

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

/* renamed from: il */
/* loaded from: classes.dex */
public final /* synthetic */ class C4262il implements InterfaceC0750Lv, FunctionWithThrowable, InterfaceC6560oZ, InterfaceC1181Sm, InterfaceC8952cD0, InterfaceC1749as, InterfaceC0813Mv, InterfaceC1332VA, InterfaceC11821yc1, Provider, InterfaceC8216Rj0, InterfaceC8268Sj0 {

    /* renamed from: b */
    public static final C4262il f29438b = new C4262il(0);

    /* renamed from: c */
    public static final C4262il f29439c = new C4262il(1);

    /* renamed from: a */
    public final /* synthetic */ int f29440a;

    public /* synthetic */ C4262il(int i) {
        this.f29440a = i;
    }

    /* renamed from: e */
    public static Bitmap m19090e(int i, byte[] bArr) throws A60 {
        try {
            return UO1.m8005b(i, bArr);
        } catch (C10103lA0 e) {
            throw new A60("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new A60(e2);
        }
    }

    @Override // p000.InterfaceC1749as
    /* renamed from: a */
    public void mo10348a(Cipher cipher, Key key, ByteArrayOutputStream byteArrayOutputStream) throws InvalidKeyException, IOException {
        switch (this.f29440a) {
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
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4262il.apply(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC1181Sm
    /* renamed from: b */
    public boolean mo7449b(TotalCaptureResult totalCaptureResult) {
        switch (this.f29440a) {
            case 6:
                return C1622Zm.m9586i(totalCaptureResult, false);
            case 7:
                return C1622Zm.m9586i(totalCaptureResult, false);
            default:
                return C1622Zm.m9586i(totalCaptureResult, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    @Override // p000.InterfaceC1332VA
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo8320c(android.util.JsonReader r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4262il.mo8320c(android.util.JsonReader):java.lang.Object");
    }

    @Override // p000.InterfaceC0813Mv
    /* renamed from: d */
    public List mo5477d(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // p000.InterfaceC8268Sj0
    /* renamed from: f */
    public void mo3137f(Object obj, C1353VV c1353vv) {
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        return AbtRegistrar.lambda$getComponents$0(c8128Pr0);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DebuggingOverlayManager();
    }

    @Override // p000.InterfaceC8952cD0
    /* renamed from: h */
    public void mo5474h(Z61 z61) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(z61.f14738b.getWidth(), z61.f14738b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        z61.m9491b(surface, QR1.m6703a(), new C1372Vo(surface, 0, surfaceTexture));
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        InterfaceC1577Z3 interfaceC1577Z3 = (InterfaceC1577Z3) obj;
        switch (this.f29440a) {
            case 25:
                interfaceC1577Z3.getClass();
                break;
            case 26:
                interfaceC1577Z3.getClass();
                break;
            case 27:
                interfaceC1577Z3.getClass();
                break;
            default:
                interfaceC1577Z3.getClass();
                break;
        }
    }

    public /* synthetic */ C4262il(C1514Y3 c1514y3, Exception exc, int i) {
        this.f29440a = i;
    }

    public /* synthetic */ C4262il(C1514Y3 c1514y3, boolean z, int i) {
        this.f29440a = 26;
    }
}
