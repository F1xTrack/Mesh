package ru.ok.tracer.session;

import defpackage.AbstractC2141aT1;
import defpackage.AbstractC5702lU;
import defpackage.AbstractC7680vr;
import defpackage.MN;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/io/File;", "", "", "readTags", "(Ljava/io/File;)Ljava/util/List;", "tags", "LTf1;", "writeTags", "(Ljava/io/File;Ljava/util/List;)V", "tracer-commons_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TagsStorageKt {
    public static final List<String> readTags(File file) {
        if (file.exists()) {
            try {
                return AbstractC5702lU.e(file);
            } catch (IOException unused) {
                file.toString();
            }
        }
        return MN.a;
    }

    public static final void writeTags(File file, List<String> list) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), AbstractC7680vr.a);
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                outputStreamWriter.write(it.next());
                outputStreamWriter.write(10);
            }
            AbstractC2141aT1.a(outputStreamWriter, null);
        } finally {
        }
    }
}
