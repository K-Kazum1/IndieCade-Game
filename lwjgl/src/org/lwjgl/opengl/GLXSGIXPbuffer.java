/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGIX/pbuffer.txt">GLX_SGIX_pbuffer</a> extension.
 * 
 * <p>This extension defines pixel buffers (GLXPbuffers, or pbuffer for short). GLXPbuffers are additional non-visible rendering buffers for an OpenGL
 * renderer.</p>
 */
public class GLXSGIXPbuffer {

	/** Accepted by the {@code attribute} parameter of {@link GLXSGIXFBConfig#glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}. */
	public static final int
		GLX_MAX_PBUFFER_WIDTH_SGIX      = 0x8016,
		GLX_MAX_PBUFFER_HEIGHT_SGIX     = 0x8017,
		GLX_MAX_PBUFFER_PIXELS_SGIX     = 0x8018,
		GLX_OPTIMAL_PBUFFER_WIDTH_SGIX  = 0x8019,
		GLX_OPTIMAL_PBUFFER_HEIGHT_SGIX = 0x801A;

	/**
	 * Returned by {@link GLXSGIXFBConfig#glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} (when {@code attribute} is set to {@link GLXSGIXFBConfig#GLX_DRAWABLE_TYPE_SGIX DRAWABLE_TYPE_SGIX}) and
	 * accepted by the {@code attrib_list} parameter of {@link GLXSGIXFBConfig#glXChooseFBConfigSGIX ChooseFBConfigSGIX} (following the
	 * {@link GLXSGIXFBConfig#GLX_DRAWABLE_TYPE_SGIX DRAWABLE_TYPE_SGIX} token).
	 */
	public static final int GLX_PBUFFER_BIT_SGIX = 0x4;

	/** Accepted by the {@code attrib_list} parameter of {@link #glXCreateGLXPbufferSGIX CreateGLXPbufferSGIX} and by the {@code attribute} parameter of {@link #glXQueryGLXPbufferSGIX QueryGLXPbufferSGIX}. */
	public static final int
		GLX_PRESERVED_CONTENTS_SGIX = 0x801B,
		GLX_LARGEST_PBUFFER_SGIX    = 0x801C;

	/** Accepted by the {@code attribute} parameter of {@link #glXQueryGLXPbufferSGIX QueryGLXPbufferSGIX}. */
	public static final int
		GLX_WIDTH_SGIX      = 0x801D,
		GLX_HEIGHT_SGIX     = 0x801E,
		GLX_EVENT_MASK_SGIX = 0x801F;

	/** Accepted by the {@code mask} parameter of {@link #glXSelectEventSGIX SelectEventSGIX} and returned in the {@code mask} parameter of {@link #glXGetSelectedEventSGIX GetSelectedEventSGIX}. */
	public static final int GLX_BUFFER_CLOBBER_MASK_SGIX = 0x8000000;

	/** Returned in the {@code event_type} field of a "buffer clobber" event. */
	public static final int
		GLX_DAMAGED_SGIX = 0x8020,
		GLX_SAVED_SGIX   = 0x8021;

	/** Returned in the {@code draw_type} field of a "buffer clobber" event. */
	public static final int
		GLX_WINDOW_SGIX  = 0x8022,
		GLX_PBUFFER_SGIX = 0x8023;

	/** Returned in the {@code mask} field of a "buffer clobber" event. */
	public static final int
		GLX_FRONT_LEFT_BUFFER_BIT_SGIX  = 0x1,
		GLX_FRONT_RIGHT_BUFFER_BIT_SGIX = 0x2,
		GLX_BACK_LEFT_BUFFER_BIT_SGIX   = 0x4,
		GLX_BACK_RIGHT_BUFFER_BIT_SGIX  = 0x8,
		GLX_AUX_BUFFERS_BIT_SGIX        = 0x10,
		GLX_DEPTH_BUFFER_BIT_SGIX       = 0x20,
		GLX_STENCIL_BUFFER_BIT_SGIX     = 0x40,
		GLX_ACCUM_BUFFER_BIT_SGIX       = 0x80,
		GLX_SAMPLE_BUFFERS_BIT_SGIX     = 0x100;

	protected GLXSGIXPbuffer() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXCreateGLXPbufferSGIX, caps.glXDestroyGLXPbufferSGIX, caps.glXQueryGLXPbufferSGIX, caps.glXSelectEventSGIX, caps.glXGetSelectedEventSGIX
		);
	}

	// --- [ glXCreateGLXPbufferSGIX ] ---

	/**
	 * Creates a single GLXPbuffer and returns its XID.
	 *
	 * @param display     the connection to the X server
	 * @param config      the {@code GLXFBConfig}
	 * @param width       the pbuffer width
	 * @param height      the pbuffer height
	 * @param attrib_list an optional null-terminated list of attributes
	 */
	public static long nglXCreateGLXPbufferSGIX(long display, long config, int width, int height, long attrib_list) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateGLXPbufferSGIX;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		return callPPIIPP(__functionAddress, display, config, width, height, attrib_list);
	}

	/**
	 * Creates a single GLXPbuffer and returns its XID.
	 *
	 * @param display     the connection to the X server
	 * @param config      the {@code GLXFBConfig}
	 * @param width       the pbuffer width
	 * @param height      the pbuffer height
	 * @param attrib_list an optional null-terminated list of attributes
	 */
	public static long glXCreateGLXPbufferSGIX(long display, long config, int width, int height, IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		return nglXCreateGLXPbufferSGIX(display, config, width, height, memAddressSafe(attrib_list));
	}

	// --- [ glXDestroyGLXPbufferSGIX ] ---

	/**
	 * Destroys a GLXPbuffer.
	 *
	 * @param display the connection to the X server
	 * @param pbuf    the pbuffer to destroy
	 */
	public static void glXDestroyGLXPbufferSGIX(long display, long pbuf) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXDestroyGLXPbufferSGIX;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(pbuf);
		}
		callPPV(__functionAddress, display, pbuf);
	}

	// --- [ glXQueryGLXPbufferSGIX ] ---

	/**
	 * Queries an attribute associated with a GLXPbuffer.
	 *
	 * @param display   the connection to the X server
	 * @param pbuf      the pbuffer being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static void nglXQueryGLXPbufferSGIX(long display, long pbuf, int attribute, long value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryGLXPbufferSGIX;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(pbuf);
		}
		callPPIPV(__functionAddress, display, pbuf, attribute, value);
	}

	/**
	 * Queries an attribute associated with a GLXPbuffer.
	 *
	 * @param display   the connection to the X server
	 * @param pbuf      the pbuffer being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static void glXQueryGLXPbufferSGIX(long display, long pbuf, int attribute, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglXQueryGLXPbufferSGIX(display, pbuf, attribute, memAddress(value));
	}

	// --- [ glXSelectEventSGIX ] ---

	/**
	 * Selects which GLX events should be received on a GLXdrawable.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the GLXDrawable
	 * @param mask     the selection mask
	 */
	public static void glXSelectEventSGIX(long display, long drawable, long mask) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXSelectEventSGIX;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
		}
		callPPPV(__functionAddress, display, drawable, mask);
	}

	// --- [ glXGetSelectedEventSGIX ] ---

	/**
	 * Returns which GLX events are selected for a GLXdrawable.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the GLXDrawable
	 * @param mask     returns the selection mask
	 */
	public static void nglXGetSelectedEventSGIX(long display, long drawable, long mask) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetSelectedEventSGIX;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
		}
		callPPPV(__functionAddress, display, drawable, mask);
	}

	/**
	 * Returns which GLX events are selected for a GLXdrawable.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the GLXDrawable
	 * @param mask     returns the selection mask
	 */
	public static void glXGetSelectedEventSGIX(long display, long drawable, PointerBuffer mask) {
		if ( CHECKS )
			checkBuffer(mask, 1);
		nglXGetSelectedEventSGIX(display, drawable, memAddress(mask));
	}

}