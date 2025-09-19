package ru.ok.tracer;

import android.content.Context;
import defpackage.AbstractC1676Vg0;
import defpackage.AbstractC5702lU;
import defpackage.InterfaceC5908mZ;
import java.io.File;
import kotlin.Metadata;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.utils.TracerFiles;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Tracer$init$1 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tracer$init$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final File invoke() {
        return AbstractC5702lU.g(FileUtils.mkdirsChecked(TracerFiles.INSTANCE.getTracerDir(this.$context)), "settings.data");
    }
}
