package p000;

import android.graphics.BitmapFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.data.imageloader.ImageDownloaderImpl;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class C60 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ String f1194a;

    /* renamed from: b */
    public final /* synthetic */ ImageDownloaderImpl f1195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60(String str, ImageDownloaderImpl imageDownloaderImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f1194a = str;
        this.f1195b = imageDownloaderImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C60(this.f1194a, this.f1195b, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C60) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        ImageDownloaderImpl imageDownloaderImpl = this.f1195b;
        String str = this.f1194a;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        try {
            if (AbstractC11374v51.m25328C(str)) {
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
