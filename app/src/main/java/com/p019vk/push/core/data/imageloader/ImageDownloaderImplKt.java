package com.p019vk.push.core.data.imageloader;

import com.p019vk.push.common.logger.LoggerProvider;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m22267d2 = {"ImageDownloader", "Lcom/vk/push/core/data/imageloader/ImageDownloader;", "loggerProvider", "Lcom/vk/push/common/logger/LoggerProvider;", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ImageDownloaderImplKt {
    public static final ImageDownloader ImageDownloader(LoggerProvider loggerProvider) {
        O90.m5968f(loggerProvider, "loggerProvider");
        return new ImageDownloaderImpl(loggerProvider);
    }
}
