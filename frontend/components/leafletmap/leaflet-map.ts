import * as L from 'leaflet';
import { customElement, html, LitElement, PropertyValues } from 'lit-element';
import { nothing } from 'lit-html';

const openStreetMapLayer = 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png';
const openStreetMapAttribution = `&copy; <a href='https://www.openstreetmap.org/copyright'>OpenStreetMap</a> contributors`;

@customElement('leaflet-map')
export class LeafletMap extends LitElement {
  private map!: L.Map;

  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }

  render() {
    return html`${nothing}`;
  }

  firstUpdated(_changedProperties: PropertyValues) {
    super.firstUpdated(_changedProperties);

    this.map = L.map(this);
    let tileLayer = L.tileLayer(openStreetMapLayer, { attribution: openStreetMapAttribution, maxZoom: 13 });
    tileLayer.addTo(this.map);
  }

  async setView(latitude: number, longitude: number, zoomLevel: number) {
    await this.updateComplete; // Make sure map has been initialized
    this.map.setView([latitude, longitude], zoomLevel);
  }

  async addMarker(latitude: number, longitude: number) {
    await this.updateComplete; // Make sure map has been initialized

    var greenIcon = L.icon({
      iconUrl: 'https://toppng.com/uploads/preview/map-point-google-map-marker-gif-11562858751s4qufnxuml.png',
      shadowUrl: 'leaf-shadow.png',

      iconSize:     [38, 95] // size of the icon
    });

    L.marker([latitude, longitude], {
      icon: greenIcon
    }).addTo(this.map);
  }
}
