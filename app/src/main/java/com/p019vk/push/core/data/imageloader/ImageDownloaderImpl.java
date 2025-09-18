package com.p019vk.push.core.data.imageloader;

import com.p019vk.push.common.Logger;
import com.p019vk.push.common.logger.LoggerProvider;
import kotlin.Metadata;
import p000.AbstractC0705LB;
import p000.AbstractC9366fP1;
import p000.C0399GK;
import p000.C4090g1;
import p000.C60;
import p000.ExecutorC1023QF;
import p000.F71;
import p000.InterfaceC1382Vy;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/core/data/imageloader/ImageDownloaderImpl;", "Lcom/vk/push/core/data/imageloader/ImageDownloader;", "Lcom/vk/push/common/logger/LoggerProvider;", "loggerProvider", "<init>", "(Lcom/vk/push/common/logger/LoggerProvider;)V", "", "url", "Landroid/graphics/Bitmap;", "download", "(Ljava/lang/String;LVy;)Ljava/lang/Object;", "Companion", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ImageDownloaderImpl implements ImageDownloader {

    /* renamed from: a */
    public final F71 f20342a;

    public ImageDownloaderImpl(LoggerProvider loggerProvider) {
        O90.m5968f(loggerProvider, "loggerProvider");
        this.f20342a = AbstractC0705LB.m4915b(new C4090g1(24, loggerProvider));
    }

    public static final Logger access$getLogger(ImageDownloaderImpl imageDownloaderImpl) {
        return (Logger) imageDownloaderImpl.f20342a.getValue();
    }

    @Override // com.p019vk.push.core.data.imageloader.ImageDownloader
    public Object download(String str, InterfaceC1382Vy interfaceC1382Vy) {
        C0399GK c0399gk = C0399GK.f3694a;
        return AbstractC9366fP1.m18233e(ExecutorC1023QF.f9548c, new C60(str, this, null), interfaceC1382Vy);
    }
}
