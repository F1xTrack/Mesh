package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import kotlin.jvm.functions.Function2;

/* renamed from: c9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2460c9 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ URI a;
    public final /* synthetic */ C3336d9 b;
    public final /* synthetic */ File c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2460c9(URI uri, C3336d9 c3336d9, File file, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.a = uri;
        this.b = c3336d9;
        this.c = file;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C2460c9(this.a, this.b, this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2460c9) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws C7143t2, C1319Qr0 {
        InputStream inputStreamOpenStream;
        File file = this.c;
        URI uri = this.a;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        try {
            String string = uri.toString();
            O90.e(string, "toString(...)");
            if (AbstractC7538v51.p(string, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
                inputStreamOpenStream = FirebasePerfUrlConnection.openStream(uri.toURL());
            } else {
                Context contextC = this.b.b().c();
                if (contextC == null) {
                    throw new C7143t2(6);
                }
                String string2 = uri.toString();
                O90.e(string2, "toString(...)");
                inputStreamOpenStream = BQ1.b(contextC, string2);
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    O90.c(inputStreamOpenStream);
                    NP1.a(inputStreamOpenStream, fileOutputStream, 8192);
                    AbstractC2141aT1.a(fileOutputStream, null);
                    AbstractC2141aT1.a(inputStreamOpenStream, null);
                    return Uri.fromFile(file);
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            String string3 = uri.toString();
            O90.e(string3, "toString(...)");
            throw new C1319Qr0(string3);
        }
    }
}
