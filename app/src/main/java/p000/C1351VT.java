package p000;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import expo.modules.filesystem.DownloadOptions;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* renamed from: VT */
/* loaded from: classes2.dex */
public final class C1351VT extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ C0534IT f12586a;

    /* renamed from: b */
    public final /* synthetic */ C1414WT f12587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351VT(InterfaceC1382Vy interfaceC1382Vy, C0534IT c0534it, C1414WT c1414wt) {
        super(2, interfaceC1382Vy);
        this.f12586a = c0534it;
        this.f12587b = c1414wt;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C1351VT(interfaceC1382Vy, this.f12586a, this.f12587b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        ((C1351VT) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
        return null;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        C0534IT c0534it = this.f12586a;
        DownloadOptions downloadOptions = c0534it.f4940a;
        DN0 dn0 = c0534it.f4941b;
        File file = c0534it.f4942c;
        boolean z = c0534it.f4943d;
        InterfaceC11518wE0 interfaceC11518wE0 = c0534it.f4944e;
        try {
            HS0 hs0Execute = FirebasePerfOkHttpClient.execute(dn0);
            IS0 is0 = hs0Execute.f4301g;
            O90.m5965c(is0);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(is0.m3876m());
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i);
            }
            Bundle bundle = new Bundle();
            C1414WT c1414wt = this.f12587b;
            bundle.putString("uri", Uri.fromFile(file).toString());
            bundle.putInt("status", hs0Execute.f4298d);
            bundle.putBundle("headers", C1414WT.m8771k(c1414wt, hs0Execute.f4300f));
            boolean md5 = downloadOptions.getMd5();
            Boolean boolValueOf = Boolean.valueOf(md5);
            if (!md5) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                bundle.putString("md5", C1414WT.m8769i(c1414wt, file));
            }
            hs0Execute.close();
            interfaceC11518wE0.resolve(bundle);
        } catch (Exception e) {
            if (dn0.f1994o) {
                interfaceC11518wE0.resolve(null);
                return null;
            }
            String message = e.getMessage();
            if (message != null) {
                new Integer(Log.e(AbstractC1477XT.f13800a, message));
            }
            interfaceC11518wE0.reject(AbstractC1477XT.f13800a, e.getMessage(), e);
        }
        return null;
    }
}
