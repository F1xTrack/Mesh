package defpackage;

import android.graphics.BitmapFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.vk.push.common.Logger;
import com.vk.push.core.data.imageloader.ImageDownloaderImpl;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class C60 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ImageDownloaderImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60(String str, ImageDownloaderImpl imageDownloaderImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.a = str;
        this.b = imageDownloaderImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C60(this.a, this.b, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C60) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        ImageDownloaderImpl imageDownloaderImpl = this.b;
        String str = this.a;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        try {
            if (AbstractC7538v51.C(str)) {
                throw new IllegalArgumentException("You have to provide a valid URL");
            }
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            if (uRLConnection.getContentLength() <= 1048576) {
                return BitmapFactory.decodeStream(uRLConnection.getInputStream());
            }
            Logger.DefaultImpls.warn$default(ImageDownloaderImpl.access$getLogger(imageDownloaderImpl), "Image size exceeds 1048576 bytes", null, 2, null);
            return null;
        } catch (Exception e) {
            ImageDownloaderImpl.access$getLogger(imageDownloaderImpl).error("Could not download image", e);
            return null;
        }
    }
}
