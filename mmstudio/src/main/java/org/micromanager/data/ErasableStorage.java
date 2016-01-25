///////////////////////////////////////////////////////////////////////////////
//PROJECT:       Micro-Manager
//SUBSYSTEM:     Data API
//-----------------------------------------------------------------------------
//
// AUTHOR:       Chris Weisiger, 2015
//
// COPYRIGHT:    University of California, San Francisco, 2015
//
// LICENSE:      This file is distributed under the BSD license.
//               License text is included with the source distribution.
//
//               This file is distributed in the hope that it will be useful,
//               but WITHOUT ANY WARRANTY; without even the implied warranty
//               of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
//
//               IN NO EVENT SHALL THE COPYRIGHT OWNER OR
//               CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
//               INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES.

package org.micromanager.data;

import java.util.List;

/**
 * This interface is for Storage entities that allow the overwriting and
 * deletion of Images, as per ErasableDatastore.
 */
public interface ErasableStorage extends Storage {
   /**
    * Delete an image from the Storage. Posts an ImageDeletedEvent to the
    * event bus. Throws an IllegalArgumentException if the provided coordinates
    * do not correspond to any image in the Storage.
    * @param coords Coordinates of the image to remove.
    * @throws IllegalArgumentException if the coords do not match any image.
    */
   public void deleteImage(Coords coords) throws IllegalArgumentException;
}