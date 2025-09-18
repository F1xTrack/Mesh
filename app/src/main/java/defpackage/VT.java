package defpackage;

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

/* loaded from: classes2.dex */
public final class VT extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ IT a;
    public final /* synthetic */ WT b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VT(InterfaceC1729Vy interfaceC1729Vy, IT it, WT wt) {
        super(2, interfaceC1729Vy);
        this.a = it;
        this.b = wt;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new VT(interfaceC1729Vy, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        ((VT) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
        return null;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        IT it = this.a;
        DownloadOptions downloadOptions = it.a;
        DN0 dn0 = it.b;
        File file = it.c;
        boolean z = it.d;
        InterfaceC7754wE0 interfaceC7754wE0 = it.e;
        try {
            HS0 hs0Execute = FirebasePerfOkHttpClient.execute(dn0);
            IS0 is0 = hs0Execute.g;
            O90.c(is0);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(is0.m());
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
            WT wt = this.b;
            bundle.putString("uri", Uri.fromFile(file).toString());
            bundle.putInt("status", hs0Execute.d);
            bundle.putBundle("headers", WT.k(wt, hs0Execute.f));
            boolean md5 = downloadOptions.getMd5();
            Boolean boolValueOf = Boolean.valueOf(md5);
            if (!md5) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                bundle.putString("md5", WT.i(wt, file));
            }
            hs0Execute.close();
            interfaceC7754wE0.resolve(bundle);
        } catch (Exception e) {
            if (dn0.o) {
                interfaceC7754wE0.resolve(null);
                return null;
            }
            String message = e.getMessage();
            if (message != null) {
                new Integer(Log.e(XT.a, message));
            }
            interfaceC7754wE0.reject(XT.a, e.getMessage(), e);
        }
        return null;
    }
}
