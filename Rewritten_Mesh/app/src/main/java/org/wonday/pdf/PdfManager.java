package org.wonday.pdf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.os.HandlerThread;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Config;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import p000.C0471HT;
import p000.C11891zA0;
import p000.C6340l4;
import p000.C6404m5;
import p000.C8071Oo1;
import p000.C8456Vz0;
import p000.EnumC0599JV;
import p000.GestureDetectorOnGestureListenerC4110gL;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.S91;
import p000.UN1;
import p000.ZH0;

@InterfaceC9101dL0(name = PdfManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class PdfManager extends SimpleViewManager<C11891zA0> implements ZH0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String REACT_CLASS = "RNPDFPdfView";
    private Context context;
    private final InterfaceC7543Ek1 mDelegate = new C6340l4(this, 7);
    private C11891zA0 pdfView;

    public PdfManager() {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    public InterfaceC7543Ek1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C11891zA0 createViewInstance(S91 s91) {
        C11891zA0 c11891zA0 = new C11891zA0(s91, null);
        c11891zA0.f45934a = 1.0f;
        c11891zA0.f45935b = 1.75f;
        c11891zA0.f45936c = 3.0f;
        c11891zA0.f45942i = 0.0f;
        c11891zA0.f45943j = 0.0f;
        c11891zA0.f45944k = 1.0f;
        c11891zA0.f45945l = true;
        c11891zA0.f45933M = 1;
        c11891zA0.f45950q = new C0471HT();
        EnumC0599JV enumC0599JV = EnumC0599JV.f5557a;
        c11891zA0.f45952s = enumC0599JV;
        c11891zA0.f45953t = false;
        c11891zA0.f45954u = 0;
        c11891zA0.f45955v = false;
        c11891zA0.f45956w = false;
        c11891zA0.f45957x = true;
        c11891zA0.f45958y = true;
        c11891zA0.f45959z = true;
        c11891zA0.f45921A = false;
        c11891zA0.f45922B = true;
        c11891zA0.f45924D = false;
        c11891zA0.f45925E = true;
        c11891zA0.f45926F = new PaintFlagsDrawFilter(0, 3);
        c11891zA0.f45927G = 0;
        c11891zA0.f45928H = false;
        c11891zA0.f45929I = true;
        c11891zA0.f45930J = new ArrayList(10);
        c11891zA0.f45931K = false;
        c11891zA0.f45947n = new HandlerThread("PDF renderer");
        if (!c11891zA0.isInEditMode()) {
            c11891zA0.f45937d = new C8071Oo1(5);
            C6404m5 c6404m5 = new C6404m5();
            c6404m5.f37466a = false;
            c6404m5.f37467b = false;
            c6404m5.f37468c = c11891zA0;
            c6404m5.f37470e = new OverScroller(c11891zA0.getContext());
            c11891zA0.f45938e = c6404m5;
            GestureDetectorOnGestureListenerC4110gL gestureDetectorOnGestureListenerC4110gL = new GestureDetectorOnGestureListenerC4110gL();
            gestureDetectorOnGestureListenerC4110gL.f27682e = false;
            gestureDetectorOnGestureListenerC4110gL.f27683f = false;
            gestureDetectorOnGestureListenerC4110gL.f27684g = false;
            gestureDetectorOnGestureListenerC4110gL.f27678a = c11891zA0;
            gestureDetectorOnGestureListenerC4110gL.f27679b = c6404m5;
            gestureDetectorOnGestureListenerC4110gL.f27680c = new GestureDetector(c11891zA0.getContext(), gestureDetectorOnGestureListenerC4110gL);
            gestureDetectorOnGestureListenerC4110gL.f27681d = new ScaleGestureDetector(c11891zA0.getContext(), gestureDetectorOnGestureListenerC4110gL);
            c11891zA0.setOnTouchListener(gestureDetectorOnGestureListenerC4110gL);
            c11891zA0.f45939f = gestureDetectorOnGestureListenerC4110gL;
            c11891zA0.f45949p = new C8456Vz0(c11891zA0);
            c11891zA0.f45951r = new Paint();
            new Paint().setStyle(Paint.Style.STROKE);
            c11891zA0.f45923C = new PdfiumCore(s91, new Config());
            c11891zA0.setWillNotDraw(false);
        }
        c11891zA0.f46695N = 1;
        c11891zA0.f46696O = false;
        c11891zA0.f46697P = 1.0f;
        c11891zA0.f46698Q = 1.0f;
        c11891zA0.f46699R = 3.0f;
        c11891zA0.f46701T = 10;
        c11891zA0.f46702U = "";
        c11891zA0.f46703V = true;
        c11891zA0.f46704W = true;
        c11891zA0.f46705a0 = true;
        c11891zA0.f46706b0 = false;
        c11891zA0.f46707c0 = false;
        c11891zA0.f46708d0 = false;
        c11891zA0.f46709e0 = enumC0599JV;
        c11891zA0.f46710q1 = false;
        c11891zA0.f46711r1 = true;
        c11891zA0.f46712s1 = 0.0f;
        c11891zA0.f46713t1 = 0.0f;
        c11891zA0.f46714u1 = 0.0f;
        c11891zA0.f46715v1 = 0;
        c11891zA0.f46716w1 = 0;
        this.pdfView = c11891zA0;
        return c11891zA0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C11891zA0 c11891zA0) throws FileNotFoundException {
        super.onAfterUpdateTransaction((PdfManager) c11891zA0);
        c11891zA0.m26324v();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C11891zA0 c11891zA0) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C11891zA0 c11891zA0, String str, ReadableArray readableArray) {
        UN1.m7999c(c11891zA0);
        if ("setNativePage".equals(str)) {
            UN1.m7999c(readableArray);
            setNativePage(c11891zA0, readableArray.getInt(0));
        }
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "enableAnnotationRendering")
    public void setEnableAnnotationRendering(C11891zA0 c11891zA0, boolean z) {
        c11891zA0.setEnableAnnotationRendering(z);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "enableAntialiasing")
    public void setEnableAntialiasing(C11891zA0 c11891zA0, boolean z) {
        c11891zA0.setEnableAntialiasing(z);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "enableDoubleTapZoom")
    public void setEnableDoubleTapZoom(C11891zA0 c11891zA0, boolean z) {
        c11891zA0.setEnableDoubleTapZoom(z);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "enablePaging")
    public void setEnablePaging(C11891zA0 c11891zA0, boolean z) {
        c11891zA0.setEnablePaging(z);
    }

    @Override // p000.ZH0
    public void setEnableRTL(C11891zA0 c11891zA0, boolean z) {
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "fitPolicy")
    public void setFitPolicy(C11891zA0 c11891zA0, int i) {
        c11891zA0.setFitPolicy(i);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "horizontal")
    public void setHorizontal(C11891zA0 c11891zA0, boolean z) {
        c11891zA0.setHorizontal(z);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "maxScale")
    public void setMaxScale(C11891zA0 c11891zA0, float f) {
        c11891zA0.setMaxScale(f);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "minScale")
    public void setMinScale(C11891zA0 c11891zA0, float f) {
        c11891zA0.setMinScale(f);
    }

    @Override // p000.ZH0
    public void setNativePage(C11891zA0 c11891zA0, int i) {
        this.pdfView.setPage(i);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "page")
    public void setPage(C11891zA0 c11891zA0, int i) {
        c11891zA0.setPage(i);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "password")
    public void setPassword(C11891zA0 c11891zA0, String str) {
        c11891zA0.setPassword(str);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "path")
    public void setPath(C11891zA0 c11891zA0, String str) {
        c11891zA0.setPath(str);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "scale")
    public void setScale(C11891zA0 c11891zA0, float f) {
        c11891zA0.setScale(f);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "scrollEnabled")
    public void setScrollEnabled(C11891zA0 c11891zA0, boolean z) {
        this.pdfView.setScrollEnabled(z);
    }

    @Override // p000.ZH0
    public void setShowsHorizontalScrollIndicator(C11891zA0 c11891zA0, boolean z) {
    }

    @Override // p000.ZH0
    public void setShowsVerticalScrollIndicator(C11891zA0 c11891zA0, boolean z) {
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "singlePage")
    public void setSinglePage(C11891zA0 c11891zA0, boolean z) {
        c11891zA0.setSinglePage(z);
    }

    @Override // p000.ZH0
    @InterfaceC9871jM0(name = "spacing")
    public void setSpacing(C11891zA0 c11891zA0, int i) {
        c11891zA0.setSpacing(i);
    }

    public PdfManager(ReactApplicationContext reactApplicationContext) {
        this.context = reactApplicationContext;
    }
}
