package p000;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import kotlin.jvm.functions.Function2;

/* renamed from: c9 */
/* loaded from: classes2.dex */
public final class C1829c9 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ URI f17333a;

    /* renamed from: b */
    public final /* synthetic */ C3910d9 f17334b;

    /* renamed from: c */
    public final /* synthetic */ File f17335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1829c9(URI uri, C3910d9 c3910d9, File file, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f17333a = uri;
        this.f17334b = c3910d9;
        this.f17335c = file;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C1829c9(this.f17333a, this.f17334b, this.f17335c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1829c9) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws C6861t2, C8180Qr0 {
        InputStream inputStreamOpenStream;
        File file = this.f17335c;
        URI uri = this.f17333a;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        try {
            String string = uri.toString();
            O90.m5967e(string, "toString(...)");
            if (AbstractC11374v51.m25351p(string, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
                inputStreamOpenStream = FirebasePerfUrlConnection.openStream(uri.toURL());
            } else {
                Context contextM987c = this.f17334b.m25721b().m987c();
                if (contextM987c == null) {
                    throw new C6861t2(6);
                }
                String string2 = uri.toString();
                O90.m5967e(string2, "toString(...)");
                inputStreamOpenStream = BQ1.m717b(contextM987c, string2);
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    O90.m5965c(inputStreamOpenStream);
                    NP1.m5671a(inputStreamOpenStream, fileOutputStream, 8192);
                    AbstractC8729aT1.m9749a(fileOutputStream, null);
                    AbstractC8729aT1.m9749a(inputStreamOpenStream, null);
                    return Uri.fromFile(file);
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            String string3 = uri.toString();
            O90.m5967e(string3, "toString(...)");
            throw new C8180Qr0(string3);
        }
    }
}
