package p000;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* renamed from: kt0 */
/* loaded from: classes.dex */
public final class C10065kt0 implements InterfaceC11631x70 {
    @Override // p000.InterfaceC11631x70
    public final InterfaceC11504w70 createImageTranscoder(D60 d60, boolean z) {
        O90.m5968f(d60, "imageFormat");
        try {
            Class cls = Boolean.TYPE;
            Object objNewInstance = NativeJpegTranscoderFactory.class.getConstructor(Integer.TYPE, cls, cls).newInstance(2048, Boolean.FALSE, Boolean.TRUE);
            O90.m5966d(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            InterfaceC11504w70 interfaceC11504w70CreateImageTranscoder = ((InterfaceC11631x70) objNewInstance).createImageTranscoder(d60, z);
            return interfaceC11504w70CreateImageTranscoder == null ? new C0328FC(z, false) : interfaceC11504w70CreateImageTranscoder;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        } catch (SecurityException e6) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        }
    }
}
