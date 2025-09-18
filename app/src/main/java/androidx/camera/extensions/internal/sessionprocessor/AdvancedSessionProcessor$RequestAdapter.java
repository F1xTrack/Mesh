package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.G10;
import p000.InterfaceC6854sw;
import p000.RR0;

/* loaded from: classes.dex */
class AdvancedSessionProcessor$RequestAdapter implements RR0 {
    private final RequestProcessorImpl.Request mImplRequest;
    private final InterfaceC6854sw mParameters;
    private final List<Integer> mTargetOutputConfigIds;
    private final int mTemplateId;

    public AdvancedSessionProcessor$RequestAdapter(RequestProcessorImpl.Request request) {
        this.mImplRequest = request;
        ArrayList arrayList = new ArrayList();
        Iterator it = request.getTargetOutputConfigIds().iterator();
        while (it.hasNext()) {
            arrayList.add((Integer) it.next());
        }
        this.mTargetOutputConfigIds = arrayList;
        G10 g10 = new G10(28);
        for (CaptureRequest.Key key : request.getParameters().keySet()) {
            g10.m2893K(key, request.getParameters().get(key));
        }
        this.mParameters = g10.m2908x();
        this.mTemplateId = request.getTemplateId().intValue();
    }

    public RequestProcessorImpl.Request getImplRequest() {
        return this.mImplRequest;
    }

    @Override // p000.RR0
    public InterfaceC6854sw getParameters() {
        return this.mParameters;
    }

    @Override // p000.RR0
    public List<Integer> getTargetOutputConfigIds() {
        return this.mTargetOutputConfigIds;
    }

    @Override // p000.RR0
    public int getTemplateId() {
        return this.mTemplateId;
    }
}
