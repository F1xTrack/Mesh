package com.vk.push.core.data.imageloader;

import com.vk.push.common.Logger;
import com.vk.push.common.logger.LoggerProvider;
import defpackage.AbstractC3767fP1;
import defpackage.C3881g1;
import defpackage.C60;
import defpackage.F71;
import defpackage.GK;
import defpackage.InterfaceC1729Vy;
import defpackage.LB;
import defpackage.O90;
import defpackage.QF;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/vk/push/core/data/imageloader/ImageDownloaderImpl;", "Lcom/vk/push/core/data/imageloader/ImageDownloader;", "Lcom/vk/push/common/logger/LoggerProvider;", "loggerProvider", "<init>", "(Lcom/vk/push/common/logger/LoggerProvider;)V", "", "url", "Landroid/graphics/Bitmap;", "download", "(Ljava/lang/String;LVy;)Ljava/lang/Object;", "Companion", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageDownloaderImpl implements ImageDownloader {
    public final F71 a;

    public ImageDownloaderImpl(LoggerProvider loggerProvider) {
        O90.f(loggerProvider, "loggerProvider");
        this.a = LB.b(new C3881g1(24, loggerProvider));
    }

    public static final Logger access$getLogger(ImageDownloaderImpl imageDownloaderImpl) {
        return (Logger) imageDownloaderImpl.a.getValue();
    }

    @Override // com.vk.push.core.data.imageloader.ImageDownloader
    public Object download(String str, InterfaceC1729Vy interfaceC1729Vy) {
        GK gk = GK.a;
        return AbstractC3767fP1.e(QF.c, new C60(str, this, null), interfaceC1729Vy);
    }
}
