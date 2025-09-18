package ru.p031ok.tracer.session;

import java.io.File;
import kotlin.Metadata;
import p000.AbstractC6366lU;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import ru.p031ok.tracer.base.p032io.FileUtils;
import ru.p031ok.tracer.utils.TracerFiles;

@Metadata(m22266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m22267d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SessionStateStorage$fileStorage$1 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    final /* synthetic */ SessionStateStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionStateStorage$fileStorage$1(SessionStateStorage sessionStateStorage) {
        super(0);
        this.this$0 = sessionStateStorage;
    }

    @Override // p000.InterfaceC6434mZ
    public final File invoke() {
        return AbstractC6366lU.m22437g(FileUtils.mkdirsChecked(TracerFiles.INSTANCE.getTracerDir(this.this$0.context)), "session.data");
    }
}
